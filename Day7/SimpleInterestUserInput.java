package Day7;

import java.util.Scanner;

public class SimpleInterestUserInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principle : ");
        double p=sc.nextDouble();

        System.out.println("Enter the time : ");
        double t=sc.nextDouble();

        System.out.println("Enter the rate of Interest : ");
        double r=sc.nextDouble();

        double s=(p*r*t)/100;
        System.out.println(s);

    }
}
