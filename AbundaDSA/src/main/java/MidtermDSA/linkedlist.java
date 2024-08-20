package MidtermDSA;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        // Create Linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Insertion operations
        animals.add("Dog"); // Insert at the end
        animals.addFirst("Cat"); // Insert at the beginning
        animals.addLast("Elephant"); // Another way to insert at the end
        animals.add(1, "Lion"); // Insert at a specific position (index 1)

        // Display the linked list
        System.out.println("Linked list: " + animals);

        // Deletion operations
        animals.remove(); // Remove the first element
        animals.remove(1); // Remove element at a specific position (index 1)
        animals.removeFirst(); // Remove the first element (alternative)
        animals.removeLast(); // Remove the last element

        // Display the linked list after deletions
        System.out.println("Linked list after Deletion: " + animals);

        // Searching operation
        boolean containsLion = animals.contains("Lion");
        System.out.println("Contains 'Lion': " + containsLion);

        if (animals.contains("Lion")) {
            System.out.println("Contains 'Lion': True");
        } else {
            System.out.println("Contains 'Lion': False");
        }

        // Get the length of the linked list
        int length = animals.size();
        System.out.println("Length of the linked list: " + length);
    }

    
}
