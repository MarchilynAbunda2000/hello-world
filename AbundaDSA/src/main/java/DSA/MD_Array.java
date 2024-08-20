package DSA;

import javax.swing.JOptionPane;

public class MD_Array {

    public static void main(String[] args) {

        int marks[][] = {
            {77, 85, 68, 99, 87},
            {98, 56, 79, 90, 92},
            {78, 88, 56, 70, 99}
        };

//        marks[2][4]=100;
        System.out.println(marks[2][4] + "\n" + marks[2][4] );
        

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");


            }
            System.out.println(); // Move to the next row

        }
        
        
//        for (int i=0; i < marks.length; i++){
////             System.out.println(i);
//              for (int j=0; j < marks[i].length; j++){
//             System.out.print(j + " ");
//        }
//              System.out.println();
//        }
       
    }

}
