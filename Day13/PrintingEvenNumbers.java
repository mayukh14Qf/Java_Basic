package Day13;

import java.util.Scanner;

public class PrintingEvenNumbers {
    public static void main(String[] args) {
        /*

        Ask User to give a range : 20

        1 ----- > 20
        (print All the even numbers)
        2,4,6,8,10,....,18,20

         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Range : ");
        int range=sc.nextInt();

        // First Even number is : 2
        // 2nd even number : 4
        // 3rd even number : 6
        for (int i=2; i<=range; i=i+2 ){
            System.out.println(i);
        }

    }
}
