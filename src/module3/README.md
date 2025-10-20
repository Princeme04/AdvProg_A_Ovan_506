
# DocumentationExample

This repository contains a simple Java program that demonstrates how to use **Javadoc comments** to document your code.  
The example focuses on explaining the use of string variables and printing output to the console.

---

## 📘 Description

The program defines a class called `DocumentationExample` inside the package `module3`.  
It declares two string variables and prints a combined sentence using the `System.out.println()` statement.

The source code also includes properly formatted **Javadoc documentation** for the class and its methods.

---

## 🧩 Code Example

```java
package module3;

/**
 * The {@code DocumentationExample} class demonstrates the use of basic string variables
 * and the printing of concatenated output to the console.
 *
 * @author  Ovan
 * @version 1.0
 * @since   2025-10-20
 */
public class DocumentationExample {

    /**
     * The main method is the entry point of the program.
     *
     * @param args the command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        String kalimat1 = "saya bapak tetangga";
        String kalimat2 = "saya ibu budi";

        System.out.println("Berikutnya : " + kalimat1 + " " + kalimat2);
    }
}
