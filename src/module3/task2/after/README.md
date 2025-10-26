# Todo List Application

A simple command-line based Todo List application written in Java, demonstrating clean code principles through method extraction and separation of concerns.

## Features

- ✅ Add new tasks
- 📋 View all tasks
- 🔢 Input validation
- 🎯 Simple menu-driven interface

## Project Structure

```
module3/task2/after/
├── TodoListApp.java    # Main application entry point
├── Menu.java           # Menu display functionality
├── input.java          # Input reading and validation
├── Manager.java        # Task management implementation
└── TaskManager.java    # Task operations interface
```

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Terminal/Command Prompt

### Compilation
```bash
javac module3/task2/after/*.java
```

### Execution
```bash
java module3.task2.after.TodoListApp
```

## Usage

When you run the application, you'll see a menu with the following options:

```
==== TO-DO LIST MENU ====
1. Add Task
2. Show Tasks
3. Exit
Choose:
```

### Menu Options

1. **Add Task** - Enter a new task to add to your todo list
2. **Show Tasks** - Display all tasks in your list
3. **Exit** - Close the application

## Code Highlights

### Clean Code Practices Implemented

- **Method Extraction**: Separated concerns into dedicated methods
  - `showMenu()` - Displays the menu
  - `readChoice()` - Handles input validation
  - `addTask()` - Adds new tasks
  - `showTasks()` - Displays all tasks

- **Separation of Concerns**: Different classes handle specific responsibilities
  - `TodoListApp` - Main application flow
  - `Menu` - UI display
  - `input` - User input handling
  - `Manager` - Data management
  - `TaskManager` - Task operations

## Example Session

```
==== TO-DO LIST MENU ====
1. Add Task
2. Show Tasks
3. Exit
Choose: 1
Enter new task: Buy groceries
Task added successfully!

==== TO-DO LIST MENU ====
1. Add Task
2. Show Tasks
3. Exit
Choose: 2
Your To-Do List:
1. Buy groceries

==== TO-DO LIST MENU ====
1. Add Task
2. Show Tasks
3. Exit
Choose: 3
Goodbye!
```

## Future Enhancements

- [ ] Delete tasks
- [ ] Edit existing tasks
- [ ] Mark tasks as complete
- [ ] Save tasks to file
- [ ] Load tasks from file
- [ ] Task priorities
- [ ] Due dates

## Contributing

Feel free to fork this project and submit pull requests for any improvements!

## License

This project is open source and available for educational purposes.

## Author

Created as part of Module 3, Task 2 coursework demonstrating refactoring and clean code principles.
