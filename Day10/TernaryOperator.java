package Day10;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // Syntax ----> (Condition) ? (If Statement/ True Statement ) : (else Statement/False Statement)
        Scanner sc= new Scanner(System.in);

        // Check Positive or negative by using ternary operator
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();

        String output= num>0 ? "Positive" : "Negative";

        System.out.println(num>0 ? "Positive" : "Negative");
        System.out.println(output);
    }
}
