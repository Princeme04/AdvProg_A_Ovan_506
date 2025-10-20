package module2.task.task3;

import java.util.ArrayList;
import java.util.Scanner;

// Public main class (must match filename)
public class ToDoList {
    private static final Scanner sc = new Scanner(System.in);
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = readChoice();

            switch (choice) {
                case 1 -> todoList.addTask();
                case 2 -> todoList.showTasks();
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("==== TO-DO LIST MENU ====");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    private static int readChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            sc.next();
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
}

// ===============================
// Interface (same file)
// ===============================
interface TaskManager {
    void addTask();
    void showTasks();
}

// ===============================
// Implementation class (same file)
// ===============================
class TodoList implements TaskManager {
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<String> tasks = new ArrayList<>();

    @Override
    public void addTask() {
        System.out.print("Enter new task: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    @Override
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
