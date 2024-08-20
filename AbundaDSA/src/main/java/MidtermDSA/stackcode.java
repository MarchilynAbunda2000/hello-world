package MidtermDSA;

import java.util.*;

public class stackcode {

    public static void main(String[] args) {
//        Create 
        Stack<Integer> mystack = new Stack<>();

//        Insertions
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);

        System.out.println("Stack Original: " + mystack);

        //        deletion
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();

        if (mystack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        int stacksize= mystack.size();
//        System.out.println(stacksize);
//        deletion
//        mystack.pop();
//
//        System.out.println("Stack after deletion: " + mystack);
//        
//        System.out.println(mystack.peek());
//       Operations:    push(); pop(); peek();  isEmpty();  size(); 
    }

}
