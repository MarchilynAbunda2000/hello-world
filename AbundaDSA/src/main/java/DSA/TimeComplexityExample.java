package DSA;

import javax.swing.JOptionPane;

public class TimeComplexityExample {

    public static int sumArrayElements(int[] arr) {
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
//        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 77, 88, 9, 33, 23, 12, 34, 12, 34,};

        long startTime = System.nanoTime(); // Record start time

        int result = sumArrayElements(inputArray); // Code block to measure

        long endTime = System.nanoTime();   // Record end time

        long executionTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "Sum of elements: " + result + "\nExecution Time: " + executionTime + " nanoseconds");
    }
}
