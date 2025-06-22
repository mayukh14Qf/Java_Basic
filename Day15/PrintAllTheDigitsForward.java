package Day15;

import java.util.Scanner;

public class PrintAllTheDigitsForward {
    public static void main(String[] args) {

        /*
        user : 2453
        output :
        2
        4
        5
        3
         */
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();
        int n1=number;

        // finding the count
        int count=0;
        while (n1>0){
            count++;
            n1=n1/10;
        }


        int r=(int)Math.pow(10,count-1);

        while(r>0){
            System.out.println((number/r)%10);
            r=r/10;
        }


    }
}
