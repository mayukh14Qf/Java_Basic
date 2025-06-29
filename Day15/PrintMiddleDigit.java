package Day15;

import java.util.Scanner;

public class PrintMiddleDigit {
    public static void main(String[] args) {

        /*
       (H.W)
        12345  ----> one middle digit : 3 (odd case)
        1234 -----> two middle digits : 2,3 (even case)
         */



        /*

        169456 ---> even ----> count/2 --->6/2-->3rd digit(9)
                               (count/2)+1-->4th digit(4)
        12345 ------> odd ----> (count+1)/2 ---->3rd digit -->3

         */
//        System.out.println((123456/100)%10); // --->1234%10--->4
//        System.out.println((12345645/10)%10); // ---> 12345%10--->5


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= sc.nextInt();
        int temp=number; // temp ----> number

        // Count the number of digits
        int count = (number==0)?1:0;
        while (temp>0){ //0 >0
            count++;
            temp=temp/10;
        }
        // temp --->0
        //even digit
        if (count %2 ==0){  //123456 (count --->6)
            int mid1=count/2; // middle digit place         (3rd position)
            int mid2=(count/2)+1; //middle digit place       (4th position)
            System.out.println((number/(int)Math.pow(10,(count-mid1)))%10);  //6-3==>3 ===>10^3==>1000
            System.out.println((number/(int)Math.pow(10,(count-mid2)))%10); //6-4 ==>2 ===>10^2==>100
        }
        //odd digit
        else {
            int mid=(count+1)/2; // middle digit place
            System.out.println((number/(int)(Math.pow(10,(count-mid))))%10);
        }

    }
}
