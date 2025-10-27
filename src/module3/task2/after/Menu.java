package module3.task2.after;

/**
 * Utility class responsible for displaying the application menu.
 * Provides static method to show the todo list menu options to users.
 *
 * @author Princem3
 * @version 1.0
 * @since 2024
 */
public class Menu {

    /**
     * Displays the main menu of the Todo List application.
     * Shows available options: Add Task, Show Tasks, and Exit.
     * Prompts user to make a choice.
     */
    static void showMenu() {
        System.out.println("==== TO-DO LIST MENU ====");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }
}