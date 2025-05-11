package Day9;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        // Take a marks from the user
        // 1.Computer 2.English 3.Science
        // Find the average
        // Grading of the Average ------->
        /*
        avg 90 and above 90  --->O
        avg 80-89 --->E
        avg 70-79 ---->A
        avg 60-69---->B
        below 60 -->F
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks of Computer : ");
        int computer= sc.nextInt();

        System.out.println("Enter the marks of English : ");
        int english=sc.nextInt();

        System.out.println("Enter the marks of science : ");
        int science=sc.nextInt();

        double avg=(computer+english+science)/3.0;
        System.out.println("Your average is : "+avg);

        if (avg>=90){
            System.out.println("O");
        }
        else if(avg>=80){
            System.out.println("E");
        }
        else if(avg>=70){
            System.out.println("A");
        }
        else if(avg>=60){
            System.out.println("B");
        }
        else {
            System.out.println("F");
        }

    }
}
