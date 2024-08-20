
package DSA;

public class QuadraticTimeExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = containsDuplicates(array);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }
}
