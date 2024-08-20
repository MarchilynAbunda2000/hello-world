package DSA;

import java.util.Scanner;

public class PrelimAdd {

    public static void main(String[] args) {
        int a, b;

    Scanner n= new Scanner(System.in);
        System.out.println("Enter a value: ");
//    int a= n.nextInt();
        a = new Scanner(System.in).nextInt();
//        System.out.println("Enter a value: ");
//    int b= n.nextInt();
        b = new Scanner(System.in).nextInt();

        int c = a + b;

        System.out.println(c);
        
        n.close();
    }

}
