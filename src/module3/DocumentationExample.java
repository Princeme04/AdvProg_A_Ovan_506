package module3;

/**
 * The {@code DocumentationExample} class demonstrates the use of basic string variables
 * and the printing of concatenated output to the console.
 * <p>
 * This example is used to illustrate how Java documentation comments (Javadoc)
 * can be applied to a simple program.
 * </p>
 *
 * @author  [Your Name]
 * @version 1.0
 * @since   2025-10-20
 */
public class DocumentationExample {

    /**
     * The main method is the entry point of the program.
     * It declares two string variables and prints them together as output.
     *
     * @param args the command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Declare two string variables
        String kalimat1 = "saya bapak budi"; // kalimat1
        String kalimat2 = "saya ibu budi";   // kalimat2

        // Display the concatenated sentences to the console
        System.out.println("Berikutnya : " + kalimat1 + " " + kalimat2);
    }
}
