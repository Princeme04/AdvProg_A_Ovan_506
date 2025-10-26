package module3.task2.after;

import java.util.Scanner;

public class TodoListApp {
    // 1. Rename variables to be clear
    public static final Scanner scanner = new Scanner(System.in);

    // (Removed MENU_TEXT constant — using println instead)

    public static void main(String[] args) {
        while (true) {
            Menu.showMenu(); // 3. Extract method: showMenu
            int choice = input.readChoice(); // 4. Extract method: readChoice

            if (choice == 1) {
                TaskManager.addTask(); // 5. Extract method: addTask
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
