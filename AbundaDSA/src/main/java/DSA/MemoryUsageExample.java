
package DSA;



public class MemoryUsageExample {
    public static void main(String[] args) {
        int n = 1000000; // You can change 'n' to vary the input size
        int[] array = new int[n]; // Allocating an array of size 'n'

        // Filling the array with values
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        // Printing the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
