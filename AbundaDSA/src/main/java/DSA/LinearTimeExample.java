

package DSA;

public class LinearTimeExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("Sum of elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

