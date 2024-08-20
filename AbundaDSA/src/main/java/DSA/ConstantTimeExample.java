
package DSA;

public class ConstantTimeExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToFind = 3;
        boolean found = containsElement(array, elementToFind);
        System.out.println("Element found: " + found);
    }

    public static boolean containsElement(int[] array, int element) {
        // Check if the element exists in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
