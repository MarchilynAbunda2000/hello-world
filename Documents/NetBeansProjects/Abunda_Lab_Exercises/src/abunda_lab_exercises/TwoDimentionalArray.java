package abunda_lab_exercises;

public class TwoDimentionalArray {

    public static void main(String[] args) {

        int numbers[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ":" + sum);

        }

        for (int i = 0; i < numbers.length; i++) {
            int pro = 1;
            for (int j = 0; j < numbers[i].length; j++) {
                pro *= numbers[i][j];
            }
            System.out.println("Product of Row " + (i + 1) + ":" + pro);

        }
    }
}
