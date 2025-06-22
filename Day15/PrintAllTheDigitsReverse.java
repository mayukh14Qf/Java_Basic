package Day15;

import java.util.Scanner;

public class PrintAllTheDigitsReverse {
    public static void main(String[] args) {
        /*
        user : 2453
        output :
        3
        5
        4
        2
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();

        while (number>0){
            System.out.println(number%10);
            number=number/10;
        }

    }
}
