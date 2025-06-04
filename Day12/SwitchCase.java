package Day12;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*

        condition -------> L.H.S==R.H.S

         */

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value : ");
        int value=sc.nextInt(); // L.H.S

        switch (value){
            case 11:  // value == 11
                System.out.println("this is 11");
                break;
            case 14: // value== 14
                System.out.println("this is 14");
                System.out.println("hihihi");
                break;
            default: // else block ---> kind of
                System.out.println("this is neither 11 nor 14");
                break;
        }



        // Even Odd   ------> H.W



    }
}
