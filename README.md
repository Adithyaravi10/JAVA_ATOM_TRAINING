# JAVA_ATOM_TRAINING
This repository has java code done during ATOM training
# JAVA_ATOM_TRAINING  

[![GitHub stars](https://img.shields.io/github/stars/Adithyaravi10/JAVA_ATOM_TRAINING?style=flat-square)](https://github.com/Adithyaravi10/JAVA_ATOM_TRAINING)  
[![GitHub forks](https://img.shields.io/github/forks/Adithyaravi10/JAVA_ATOM_TRAINING?style=flat-square)](https://github.com/Adithyaravi10/JAVA_ATOM_TRAINING)  
[![License](https://img.shields.io/badge/license-None-lightgrey?style=flat-square)](#license)

---

## 📖 Description  

`JAVA_ATOM_TRAINING` is a collection of Java source files created during the **ATOM** training program.  
The repository serves as a personal sandbox for experimenting with Java language features, algorithms, and coding exercises covered in the course.

---

## ✨ Features  

* **Training‑focused examples** – snippets that illustrate core Java concepts (variables, control flow, OOP, collections, etc.).  
* **Self‑contained** – all code resides directly in the repository; no external build tools are required.  
* **Easy to compile and run** – works with any standard JDK (no Maven/Gradle/Ant needed).

---

## 🛠 Prerequisites  

| Requirement | Version |
|-------------|---------|
| Java Development Kit (JDK) | 8 or later |
| Git (for cloning) | any recent version |

> **Note**: The repository does not use a build system (Maven, Gradle, etc.). Compilation is performed manually with `javac`.

---

## 🚀 Installation  

```bash
# 1️⃣ Clone the repository
git clone https://github.com/Adithyaravi10/JAVA_ATOM_TRAINING.git
cd JAVA_ATOM_TRAINING

# 2️⃣ Compile all Java source files (they are located in the repository root)
#    Adjust the pattern if you place files in sub‑directories.
javac *.java
```

If the compilation succeeds, `.class` files will be generated alongside the source files.

---

## ▶️ Usage  

1. Identify the class that contains the `public static void main(String[] args)` entry point.  
2. Run it with the `java` command, replacing `<MainClass>` with the actual class name:

```bash
java <MainClass>
```

*Example (if a class named `HelloWorld` exists):*

```bash
java HelloWorld
```

> **Tip**: If your program depends on additional command‑line arguments, append them after the class name.

---

## 🐞 Troubleshooting  

| Symptom | Likely Cause | Fix |
|---------|--------------|-----|
| `javac: command not found` | JDK not installed or not in `PATH` | Install a JDK and ensure the `bin` directory is added to your system `PATH`. |
| `error: class, interface, or enum expected` | Source file contains stray characters or is not a valid Java file | Open the file and verify that it contains a proper Java class definition. |
| `java.lang.NoClassDefFoundError` | Attempting to run a class that wasn’t compiled or is in the wrong package | Re‑run `javac *.java` and make sure you are in the directory containing the compiled `.class` files. |
| `Exception in thread "main"` | Runtime error inside your code | Review the stack trace, locate the offending line, and correct the logic. |

---

## 🤝 Contributing  

Contributions are welcome! If you’d like to add new examples, improve existing code, or fix bugs:

1. Fork the repository.  
2. Create a new branch (`git checkout -b feature/your-feature`).  
3. Add or modify Java files.  
4. Commit your changes with a clear message.  
5. Open a Pull Request describing the changes.

Please keep the code style consistent with the existing files (standard Java conventions).

---

## 📄 License  

This repository does **not** include a license file. By default, the code is provided **without any granted rights**. If you wish to use or redistribute the code, please contact the repository owner or add an appropriate open‑source license.

---
