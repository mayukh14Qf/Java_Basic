package Day15;

import java.util.Scanner;

public class PrintFirstDigit {
    public static void main(String[] args) {

        /*

        user : 2375
        output : 2

         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();

        while (number>=9){
            number=number/10;
        }
        System.out.println(number);
    }
}
