package DSA;

public class ExecutionTimeExample {

    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Record start time

        // Your code to be measured goes here
        int[] array = {1, 2, 3, 4, 5};
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34};
        int sum = calculateSum(array);
        System.out.println("Sum of elements: " + sum);

        long endTime = System.nanoTime();   // Record end time
        long executionTime = endTime - startTime;

        // Print execution time in milliseconds
        System.out.println("Execution Time: " + executionTime / 1_000_000 + " ms");
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
