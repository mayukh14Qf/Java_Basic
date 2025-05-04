package Day8;

import java.util.Scanner;

public class CheckAdultOrNot {
    public static void main(String[] args) {

        // to take the user input
        Scanner sc=new Scanner(System.in);

        // taking the input from the user :
        System.out.println("Enter your age : ");
        int age=sc.nextInt();

        // checking the condition
        if (age>=18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not an Adult . ");
        }

    }
}
