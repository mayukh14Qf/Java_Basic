package Day15;

import java.util.Scanner;

public class SquareSumOfTheDigits {
    public static void main(String[] args) {
        /*

        user --> 234
        output -->4 + 9 + 16 (square(2)+square(3)+square(4))

         */


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();

        int sum=0;
        while (number>0){
            int digit=(number%10);
            sum=sum+(digit*digit);
            number=number/10;
        }
        System.out.println("Answer is : "+sum);


    }
}
