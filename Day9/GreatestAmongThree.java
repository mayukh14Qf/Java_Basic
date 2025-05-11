package Day9;

import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {

        // a. b. c. ------> Print Greatest among these three

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int a=sc.nextInt();

        System.out.println("Enter the 2nd Number : ");
        int b=sc.nextInt();

        System.out.println("Enter the 3rd Number : ");
        int c=sc.nextInt();

        if (a>c && a>b){
            System.out.println(a+ " is the greatest ");
        }
        else if (b>c && b>a){
            System.out.println(b+ " is the greatest ");
        }
        else {
            System.out.println(c+" is the greatest ");
        }

    }
}
