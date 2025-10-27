package module3.task2.after;

import java.util.Scanner;

/**
 * Main application class for the Todo List application.
 * This class provides a command-line interface for managing a simple todo list
 * with options to add tasks, view tasks, and exit the application.
 *
 * @author Princem3
 * @version 1.0
 * @since 2024
 */
public class TodoListApp {

    /**
     * Scanner instance for reading user input from console.
     * Shared across the application for all input operations.
     */
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Main entry point of the Todo List application.
     * Displays a menu and processes user choices in an infinite loop
     * until the user chooses to exit.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        while (true) {
            Menu.showMenu();
            int choice = input.readChoice();

            if (choice == 1) {
                TaskManager.addTask();
            } else if (choice == 2) {
                TaskManager.showTasks();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}