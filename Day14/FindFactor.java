package Day14;

import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        /*


        range :  5
        print : 1*2*3*4*5 ---> Answer

        range : 3
        print : 1*2*3 --->answer

         */

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number : ");
        int number=sc.nextInt();
        int factor= 1;
        for (int i=1; i<=number;i++){
            factor=factor*i;
        }
        System.out.println(factor);

        /*

        for addition operation -----> store 0
        for multiplication ------> store 1
         */

    }
}
