package Day8;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        /*

       Even ----> 0,2,4,6,8,10,........
       Odd ------> 1,3,5,7,9,........
        If we divide the even number by 2 ---- > Reminder 0
        If we divide the Odd number by 2 ---- > Reminder is not 0
         */
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int number= sc.nextInt();

        // Condition --------- >

        if (number%2 == 0){ //1==0
            System.out.println("Even Number ");
        }
        else {
            System.out.println("Odd Number ");
        }
    }
}
