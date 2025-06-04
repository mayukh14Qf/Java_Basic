package Day11;

import java.util.Scanner;

public class RooOfAnEquation {
    public static void main(String[] args) {
        /*
         Quadratic Equation (youtube)

         ax^2 + bx +c ------> 5x^2 +7x +6 ----> a,b,c coefficient
         a , b, c ----> Given
         You have to find value of x
         (-b + SquareRoot(b^2 - 4ac ))/2*a
        */

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your a : ");
        int a= sc.nextInt();

        System.out.println("Enter your b : ");
        int b= sc.nextInt();

        System.out.println("Enter your c : ");
        int c= sc.nextInt();

        double squareRoot=Math.sqrt((b*b)-(4*a*c));
        double x1= (-b+ squareRoot)/(2*a);
        double x2= (-b- squareRoot)/(2*a);
        System.out.println("Your 1st value is : "+x1);
        System.out.println("your 2nd value is : "+x2);

    }
}
