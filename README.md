# TraceSec-Prioritization

**Automatically Prioritizing Static Analyzer Findings by Tracing Security Importance**

This repository contains the tooling and datasets for our research on prioritizing static analyzer findings by tracing their security importance. The technique helps developers and security analysts focus on the most critical issues in large codebases, reducing noise and improving efficiency.

---

## 📝 Overview

Static analysis tools often generate a large number of findings, many of which are false positives or low-priority. **TraceSec-Prioritization** automates the process of prioritizing these findings by tracing their relevance to security-critical components in the codebase. The tool integrates with existing static analyzers, such as SonarQube, and leverages trace links, quality models, and design artifacts to rank findings based on their potential impact.

---

## 🛠️ Features

- **Security Importance Tracing**: Identifies and ranks static analyzer findings based on their proximity to security-critical code paths.
- **Integration with Static Analyzers**: Compatible with popular tools like SonarQube.
- **Customizable**: Allows users to define their own security importance metrics and thresholds.
- **Traceability**: Leverages trace links and design artifacts.

---

## 📦 Installation

### Prerequisites

- Java 11 or higher
- Maven (for building the tool)

### Build

1. Clone the repository:
   ```bash
   git clone https://github.com/SvenPeldszus/tracesec-prioritization.git
   cd tracesec-prioritization
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## 📚 Citation
If you use this tool or dataset in your research, please cite our paper:

```
@inproceedings{peldszus202Xtracesec,
  title     = {Too Many Issues: Automatically Prioritizing Analyzer Findings by Tracing Security Importance},
  author    = {Sven Peldszus and [Co-authors]},
  booktitle = {[Conference Name]},
  year      = {202X},
  publisher = {[Publisher]},
  doi       = {[DOI]}
}
```

## 🤝 Contributing
Contributions are welcome! Please open an issue or submit a pull request for bug fixes, new features, or documentation improvements.

## 📜 License
This project is licensed under the EPL License. See the LICENSE file for details.

## 📧 Contact
For questions or collaboration opportunities, contact Sven Peldszus or open an issue on GitHub.
