package Day15;

import java.util.Scanner;

public class SumOfTheDigit {
    public static void main(String[] args) {

        /*

        User ---> 1256
        output ---->1+2+3+4--->10

         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number=sc.nextInt();


        int sum=0;
        while (number>0){   // condition ---> same
            sum=sum+(number%10);
            number=number/10;  // step decrement ----> same
        }
        System.out.println("sum of the digits : "+sum);


    }
}
