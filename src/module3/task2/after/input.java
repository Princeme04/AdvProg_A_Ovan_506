package module3.task2.after;

public class input {
    // 4. Extracted input reading with validation
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