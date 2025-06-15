package Day14;

import java.util.Scanner;

public class SumOfNaturalNumberWhile {
    public static void main(String[] args) {

        /*
        By using While
        range : 10
        print : 1+2+3+4+.....+10 ---> Answer
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your range : ");
        int range= sc.nextInt(); // ending point

        int sum=0;
        while (range>=1){
            System.out.println(range);
            sum=sum+range;
            range--;
        }
        System.out.println("sum is : "+sum);

    }
}
