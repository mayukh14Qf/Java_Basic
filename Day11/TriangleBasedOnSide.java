package Day11;

import java.util.Scanner;

public class TriangleBasedOnSide {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter length of the 1st side :");
        int sideOne=sc.nextInt();

        System.out.println("Enter length of the 2nd side :");
        int sideTwo=sc.nextInt();

        System.out.println("Enter length of the 3rd side :");
        int sideThree=sc.nextInt();

        // Logic ------->
        // Equilateral --> same 3 sides
        //Isosceles ----> same 2 sides
        // Scalene ----> No side is same

        if (sideOne==sideTwo && sideTwo==sideThree){
            System.out.println("Equilateral");
        }
        else if (sideOne==sideTwo || sideTwo==sideThree || sideOne==sideThree){
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }

    }
}
