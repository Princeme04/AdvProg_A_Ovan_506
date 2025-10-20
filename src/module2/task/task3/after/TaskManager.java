package module2.task.task3.after;

public interface TaskManager {
    // 5. Extracted addTask logic
    static void addTask() {
        System.out.print("Enter new task: ");
        String task = TodoListApp.scanner.nextLine();
        Manager.tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // 6. Added method for showing tasks
    static void showTasks() {
        if (Manager.tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < Manager.tasks.size(); i++) {
                System.out.println((i + 1) + ". " + Manager.tasks.get(i));
            }
        }
    }
}
