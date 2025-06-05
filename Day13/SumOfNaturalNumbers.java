package Day13;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        /*
        Enter Your Range : User Input (8)
        1---->8
        Output ----> 1+2+3+4+5+6+7+8--->
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Range : ");
        int range=sc.nextInt();

        int sum=0;

        for (int i=1;i<=range;i++){
            sum=sum+i;
        }

        System.out.println(sum);

    }
}
