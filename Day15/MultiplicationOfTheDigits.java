package Day15;

import java.util.Scanner;

public class MultiplicationOfTheDigits {
    public static void main(String[] args) {
        /*
        user --> 2341
        output ---> 2*3*4*1
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();

        int multi=1;
        while (number>0){
            multi=multi*(number%10);
            number=number/10;
        }
        System.out.println("Answer is : "+multi);
    }
}
