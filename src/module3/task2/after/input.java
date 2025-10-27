package module3.task2.after;

/**
 * Utility class for handling user input operations.
 * Provides methods for reading and validating user input from the console.
 *
 * @author Princem3
 * @version 1.0
 * @since 2024
 */
public class input {

    /**
     * Reads and validates an integer choice from user input.
     * Continuously prompts the user until a valid integer is entered.
     * Clears the scanner buffer after reading the integer.
     *
     * @return the validated integer choice entered by the user
     */
    static int readChoice() {
        while (!TodoListApp.scanner.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            TodoListApp.scanner.next();
        }
        int choice = TodoListApp.scanner.nextInt();
        TodoListApp.scanner.nextLine();
        return choice;
    }
}