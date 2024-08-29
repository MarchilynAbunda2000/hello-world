
package abunda_lab_exercises;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        // Create Linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Insertion operations
        animals.add("Dog"); 
        animals.addFirst("Cat"); 
        animals.addLast("Elephant"); 
        animals.add(1, "Lion"); 

        // Display the linked list
        System.out.println("Linked list: " + animals);

        // Deletion operations
//        animals.remove(); 
//        animals.remove(1); 
//        animals.removeFirst(); 
//        animals.removeLast(); 

        // Display the linked list after deletions
        System.out.println("Linked list after Deletion: " + animals);

        // Searching operation
        boolean containsLion = animals.contains("lion");
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
