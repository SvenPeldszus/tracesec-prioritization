import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class PrioTopKAnalysis {
	
	
    
    public static List<FindingPrio> clusterTopK(List<FindingPrio> list, int k){
    	List<FindingPrio> newlist = new ArrayList<FindingPrio>();
    	
    	for(FindingPrio prio : list) {
    		prio.rerand();
    	}
    	
    	Collections.sort(list);
    	int top = 1;
    	int rest = 0;
    	
    	for(int i = list.size()-1; i > -1; i--) {
    		
    		if(i > list.size()-(k+2)) {
    			newlist.add(new FindingPrio(list.get(i).getID(), top));
    		}
    		else {
    			newlist.add(new FindingPrio(list.get(i).getID(), rest));
    		}
    		
    	}
    	
    	return newlist;
    }
    
    
    
    public static Integer[] getLabels(List<FindingPrio> list) {
    	HashSet<Integer> labelset = new HashSet<Integer>();
        for(FindingPrio prio : list) {
        	labelset.add(prio.getPrio());
        }
        
        Integer[] result = labelset.toArray(new Integer[labelset.size()]);
        
        Arrays.sort(result);
        
        return result;
    }
    
    /*
     * https://oecd.ai/en/catalogue/metrics/adjusted-rand-index-%28ari%29
     */
    public static double getRandIndex(List<FindingPrio> prio1, List<FindingPrio> prio2) {
    	if (prio1.size() != prio2.size()) {
            throw new IllegalArgumentException(String.format("The number of items does not match: %d != %d.", prio1.size(), prio2.size()));
        }
    	
    	FindingPrioIDComparator byId = new FindingPrioIDComparator();
    	Collections.sort(prio1, byId);
    	Collections.sort(prio2, byId);
    	
        int n = prio1.size();

        Integer[] label1 = getLabels(prio1);
        int n1 = label1.length;
        
        Integer[] label2 = getLabels(prio2);
        int n2 = label2.length;
        


        // Contingency matrix
        int[][] count = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                int match = 0;

                for (int k = 0; k < n; k++) {
                    if (prio1.get(k).getPrio() == label1[i] && prio2.get(k).getPrio() == label2[j]) {
                        match++;
                    }
                }

                count[i][j] = match;
            }
        }

        // Marginals
        int[] count1 = new int[n1];
        int[] count2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                count1[i] += count[i][j];
                count2[j] += count[i][j];
            }
        }
        

        
        double rand = 0.0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            		rand += choose(count[i][j], 2);
            }
        }
        
        double a = 0.0;
        for (int i = 0; i < n1; i++) {
        		a += choose(count1[i], 2);
        }
        
        double b = 0.0;
        for (int j = 0; j < n2; j++) {
        		b += choose(count2[j], 2);
        }
        
        double exp = (a * b) / choose(n, 2);
        
        double rand_max = (a + b) /2;
        
        double arand = (rand - exp) / (rand_max - exp);
        
        return arand;
    }
    
    /*
     * https://programming-idioms.org/idiom/67/binomial-coefficient-n-choose-k/281/java
     */
    static double choose(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n-i))
                     .divide(BigInteger.valueOf(i+1));
        }
        
        return result.doubleValue();
    }
	
    public static List<List<FindingPrio>> readPrioList(String filepath) throws IOException, IllegalStateException, RuntimeException{
    	
    	List<List<FindingPrio>> prioLists = new ArrayList<List <FindingPrio>>();
    	
    	List<FindingPrio> manualPrios = new ArrayList<FindingPrio>();
    	List<FindingPrio> tracesecPrios = new ArrayList<FindingPrio>();
    	List<FindingPrio> sonarQubePrios = new ArrayList<FindingPrio>();
    	
    	Path path = Paths.get( filepath );
    	if ( Files.notExists( path ) ) { throw new IllegalStateException( "Failed to find file at path: " + path ); }

    	List < String > lines;
    	try { lines = Files.lines( path , StandardCharsets.UTF_8 ).toList(); } catch ( IOException e ) { throw new RuntimeException( e ); }
    	lines = lines.subList( 1 , lines.size() ); // Skip over first line.

    	for ( String line : lines )
    	{
    	    String[] parts = line.split( "," );

    	    int id = Integer.valueOf( parts[ 2 ] );
    	    int manual = Integer.valueOf( parts[ 3 ] );
    	    int tracesec = Integer.valueOf( parts[ 4 ] );
    	    int sonarQube = Integer.valueOf( parts[ 6 ] );
    	    
    	    FindingPrio manualPrio = new FindingPrio(id,manual);
    	    manualPrios.add( manualPrio );
    	    
    	    FindingPrio tracesecPrio = new FindingPrio(id,tracesec);
    	    tracesecPrios.add( tracesecPrio );
    	    
    	    FindingPrio sonarQubePrio = new FindingPrio(id,sonarQube);
    	    sonarQubePrios.add( sonarQubePrio );
    	}
    	
    	prioLists.add(manualPrios);
    	prioLists.add(tracesecPrios);
    	prioLists.add(sonarQubePrios);
    	
    	return prioLists;
    }
    
    public static void main(String[] args) throws IllegalStateException, IOException, RuntimeException {
		
		List<List<FindingPrio>> itrustPrios = readPrioList("./input/manual-prioritization-results-itrust.csv");
		List<List<FindingPrio>> cwaPrios = readPrioList("./input/manual-prioritization-results-cwa.csv");
		
		System.out.println("Adjusted Rand Index simlarity of top-k partitions compared to manual prioritization:");
		
		//System.out.println("ARI test: " + getRandIndex(itrustPrios.get(2), itrustPrios.get(2)));
		
		int k;
		double ari;
		List<FindingPrio> cluster1;
		List<FindingPrio> cluster2;
		
		System.out.println("------------------------iTrust--------------------");
		
		try (final var stream = new FileOutputStream("./output/ari-eval-tracesec-itrust.csv")) {
			
			for (int i = 0; i < 1000; i++) {
		
				System.out.println("--------------------------------------------------");
				System.out.println("top k  |      TraceSec      " + "Run: " + i);
				System.out.println("--------------------------------------------------");
			
			
				if (i == 0) {
					stream.write("6,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95\n".getBytes());
				}
				
				k = 6;
				cluster1 = clusterTopK(itrustPrios.get(0), k);
				cluster2 = clusterTopK(itrustPrios.get(1), k);
				ari = getRandIndex(cluster1, cluster2);
				
				stream.write(Double.toString(ari).getBytes());
				stream.write(',');
				System.out.println("top " + k + " | " + ari);
				
				for (k = 5; k < 100; k+=5) {
					cluster1 = clusterTopK(itrustPrios.get(0), k);
					cluster2 = clusterTopK(itrustPrios.get(1), k);
					ari = getRandIndex(cluster1, cluster2);
					
					stream.write(Double.toString(ari).getBytes());
					stream.write(',');
					System.out.println("top " + k + " | " + ari);
				}
				
				stream.write('\n');
				
			}
		}
		
		try (final var stream = new FileOutputStream("./output/ari-eval-sonarQube-itrust.csv")) {
			
			for (int i = 0; i < 1000; i++) {
		
				System.out.println("--------------------------------------------------");
				System.out.println("top k  |     SonarQube      " + "Run: " + i);
				System.out.println("--------------------------------------------------");
			
			
				if (i == 0) {
					stream.write("6,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95\n".getBytes());
				}
				
				k = 6;
				cluster1 = clusterTopK(itrustPrios.get(0), k);
				cluster2 = clusterTopK(itrustPrios.get(2), k);
				ari = getRandIndex(cluster1, cluster2);
				
				stream.write(Double.toString(ari).getBytes());
				stream.write(',');
				System.out.println("top " + k + " | " + ari);
				
				for (k = 5; k < 100; k+=5) {
					cluster1 = clusterTopK(itrustPrios.get(0), k);
					cluster2 = clusterTopK(itrustPrios.get(2), k);
					ari = getRandIndex(cluster1, cluster2);
					
					stream.write(Double.toString(ari).getBytes());
					stream.write(',');
					System.out.println("top " + k + " | " + ari);
				}
				
				stream.write('\n');
			}
		}
			
			                    
		System.out.println("--------------------------CWA---------------------");
		
		try (final var stream = new FileOutputStream("./output/ari-eval-tracesec-cwa.csv")) {
			
			for (int i = 0; i < 1000; i++) {
		
				System.out.println("--------------------------------------------------");
				System.out.println("top k  |      TraceSec      " + "Run: " + i);
				System.out.println("--------------------------------------------------");
			
				if (i == 0) {
					stream.write("6,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95\n".getBytes());
				}
				
				k = 6;
				cluster1 = clusterTopK(cwaPrios.get(0), k);
				cluster2 = clusterTopK(cwaPrios.get(1), k);
				ari = getRandIndex(cluster1, cluster2);
				
				stream.write(Double.toString(ari).getBytes());
				stream.write(',');
				System.out.println("top " + k + " | " + ari);
				
				for (k = 5; k < 100; k+=5) {
					cluster1 = clusterTopK(cwaPrios.get(0), k);
					cluster2 = clusterTopK(cwaPrios.get(1), k);
					ari = getRandIndex(cluster1, cluster2);
					
					stream.write(Double.toString(ari).getBytes());
					stream.write(',');
					System.out.println("top " + k + " | " + ari);
				}
				
				stream.write('\n');
			}
		}
		
		try (final var stream = new FileOutputStream("./output/ari-eval-sonarQube-cwa.csv")) {
		
			for (int i = 0; i < 1000; i++) {
			
				System.out.println("--------------------------------------------------");
				System.out.println("top k  |     SonarQube      " + "Run: " + i);
				System.out.println("--------------------------------------------------");
			
				if (i == 0) {
					stream.write("6,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95\n".getBytes());
				}
				
				k = 6;
				cluster1 = clusterTopK(cwaPrios.get(0), k);
				cluster2 = clusterTopK(cwaPrios.get(2), k);
				ari = getRandIndex(cluster1, cluster2);
				
				stream.write(Double.toString(ari).getBytes());
				stream.write(',');
				System.out.println("top " + k + " | " + ari);
				
				for (k = 5; k < 100; k+=5) {
					cluster1 = clusterTopK(cwaPrios.get(0), k);
					cluster2 = clusterTopK(cwaPrios.get(2), k);
					ari = getRandIndex(cluster1, cluster2);
					
					stream.write(Double.toString(ari).getBytes());
					stream.write(',');
					System.out.println("top " + k + " | " + ari);
				}
				
				stream.write('\n');
			}
		}
			
		System.out.println("-------------------------DONE---------------------");
		
	}
}
