package Day14;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        /*

        User : 3
        3
        6
        9
        12
        .
        .
        30
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int number=sc.nextInt();

        // starting ---> 1
        // ending ---->10

        for (int i=1;i<=10;i++){
            System.out.println(i*number);
        }



    }
}
