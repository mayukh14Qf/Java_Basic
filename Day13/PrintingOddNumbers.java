package Day13;

import java.util.Scanner;

public class PrintingOddNumbers {
    public static void main(String[] args) {
        /*

        Ask User to give a range : 20

        1 ----- > 20
        (print All the even numbers)
        1,3,5,7,9,....,17,19

         */


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Range : ");
        int range=sc.nextInt();

        // First odd number is : 1
        // 2nd odd number : 3
        // 3rd odd number : 5
        for (int i=1; i<=range; i=i+2 ){
            System.out.println(i);
        }
    }
}
