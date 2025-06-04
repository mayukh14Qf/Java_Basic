package Day11;

import java.util.Scanner;

public class LoanEligibilityCreditScore {
    public static void main(String[] args) {

        /*

        user credit score ---> 300 - 900
        600>creditScore---->Not eligible for Loan
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Credit Score : ");
        int creditScore= sc.nextInt();

        if (creditScore<600){
            System.out.println("You are not eligible ");
        }
        else {
            System.out.println("You are eligible ..");
        }

    }
}
