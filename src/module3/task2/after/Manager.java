package module3.task2.after;


import java.util.ArrayList;

/**
 * Manager class implementing the TaskManager interface.
 * Handles the storage and management of tasks using an ArrayList.
 * Provides centralized access to the task collection.
 *
 * @author Princem3
 * @version 1.0
 * @since 2024
 */
public class Manager implements TaskManager {

    /**
     * ArrayList containing all tasks in the todo list.
     * This collection is shared across the application to store task data.
     */
    public static final ArrayList<String> tasks = new ArrayList<>();

}