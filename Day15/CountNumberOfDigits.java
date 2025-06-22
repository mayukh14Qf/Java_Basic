package Day15;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        /*

        user --> 114567
        output -->6

         */


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();

        // 0 optimization
        int count = (number==0)?1:0;

        //negative optimization
        if (number<0){
//            number=Math.abs(number);
            number=(-1)*(number);
        }

        while (number>0){
            count++;
            number=number/10;
        }
        System.out.println("your no of digits : "+count);
    }
}
