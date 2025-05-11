package Day9;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        // 1. 0 ----> Zero
        // 2. +ve (eg. 12,56,709 )------>Positive
        // 3.-ve (eg. -7,-76,-908)------>Negative

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=sc.nextInt();

        if (number==0){
            System.out.println("The number is zero");
        }
        else if (number>0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The Number is Negative");
        }

    }
}
