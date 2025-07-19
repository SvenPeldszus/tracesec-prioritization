package org.tracesec.eval.scalability;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class DataProcessor {

	public static void main(final String[] args) throws FileNotFoundException, IOException {
		final var out = new File("averages.csv");
		out.createNewFile();
		try (var stream = new FileOutputStream(out)) {
			for (final File csv : new File("data").listFiles()) {
				final var name = csv.getName();
				if (name.endsWith(".csv")) {
					stream.write(name.substring(0, name.length() - 4).getBytes());
					stream.write(',');
					stream.write(Double
							.toString(Files.readAllLines(csv.toPath()).stream().flatMap(l -> Stream.of(l.split(",")))
									.mapToDouble(Double::parseDouble).average().getAsDouble())
							.getBytes());
					stream.write('\n');
				}
			}
		}
	}
}
