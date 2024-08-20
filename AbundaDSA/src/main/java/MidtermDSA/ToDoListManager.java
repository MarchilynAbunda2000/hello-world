
package MidtermDSA;


import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class ToDoListManager {

    public static void main(String[] args) {
        LinkedList<String> toDoList = new LinkedList<>();
        LinkedList<String> completedTasks = new LinkedList<>();
        Stack<String> undoStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("To-Do List Manager\n");

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. Undo");
            System.out.println("4. View To-Do List");
            System.out.println("5. View Completed Tasks");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    toDoList.add(taskToAdd);
                    undoStack.push("add:" + taskToAdd);
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("To-Do List:");
                        viewList(toDoList);
                        System.out.print("Enter the number of the task to mark as done: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
                            String completedTask = toDoList.remove(taskNumber - 1);
                            completedTasks.add(completedTask);
                            undoStack.push("done:" + completedTask);
                            System.out.println("Task marked as done: " + completedTask);
                        } else {
                            System.out.println("Invalid task number. Please try again.");
                        }
                    } else {
                        System.out.println("To-Do List is empty. Nothing to mark as done.");
                    }
                    break;
                case 3:
                    if (!undoStack.isEmpty()) {
                        String lastAction = undoStack.pop();
                        String[] actionParts = lastAction.split(":");
                        String actionType = actionParts[0];
                        String actionTask = actionParts[1];

                        if (actionType.equals("add")) {
                            toDoList.removeLast();
                        } else if (actionType.equals("done")) {
                            String undoneTask = completedTasks.removeLast();
                            toDoList.add(undoneTask);
                        }
                    } else {
                        System.out.println("Undo stack is empty. No actions to undo.");
                    }
                    break;
                case 4:
                    System.out.println("\nTo-Do List:");
                    viewList(toDoList);
                    break;
                case 5:
                    System.out.println("\nCompleted Tasks:");
                    viewList(completedTasks);
                    break;
                case 6:
                    System.out.println("\nGoodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println();
    }
}
