
package MidtermDSA;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class TextEditor {

    public static void main(String[] args) {
        LinkedList<String> document = new LinkedList<>();
        Stack<String> undoStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Text Editor with Undo Functionality\n");

        while (true) {
            System.out.println("1. Append Text");
            System.out.println("2. Delete Last Line");
            System.out.println("3. Undo");
            System.out.println("4. View Document");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String textToAppend = scanner.nextLine();
                    document.add(textToAppend);
                    undoStack.push("append:" + textToAppend);
                    System.out.println("\nDocument after appending:");
                    viewDocument(document);
                    break;
                case 2:
                    if (!document.isEmpty()) {
                        String deletedLine = document.removeLast();
                        undoStack.push("delete:" + deletedLine);
                        System.out.println("\nDocument after deleting the last line:");
                        viewDocument(document);
                    } else {
                        System.out.println("Document is empty. Nothing to delete.");
                    }
                    break;
                case 3:
                    if (!undoStack.isEmpty()) {
                        String lastOperation = undoStack.pop();
                        String[] operationParts = lastOperation.split(":");
                        String operationType = operationParts[0];
                        String operationText = operationParts[1];

                        if (operationType.equals("append")) {
                            document.removeLast();
                            System.out.println("\nUndo: Removed the last appended line - " + operationText);
                        } else if (operationType.equals("delete")) {
                            document.add(operationText);
                            System.out.println("\nUndo: Restored the deleted line - " + operationText);
                        }

                        System.out.println("Document after undo:");
                        viewDocument(document);
                    } else {
                        System.out.println("Undo stack is empty. No operations to undo.");
                    }
                    break;
                case 4:
                    System.out.println("\nCurrent Document:");
                    viewDocument(document);
                    break;
                case 5:
                    System.out.println("\nFinal Document:");
                    viewDocument(document);
                    System.out.println("\nGoodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewDocument(LinkedList<String> document) {
        for (String line : document) {
            System.out.println(line);
        }
        System.out.println();
    }
}
