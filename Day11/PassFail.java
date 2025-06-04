package Day11;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the bengali marks : ");
        int bengali=sc.nextInt();

        System.out.println("enter the English marks : ");
        int English=sc.nextInt();

        System.out.println("enter the Hindi marks : ");
        int Hindi=sc.nextInt();

        System.out.println("enter the Urdu marks : ");
        int Urdu=sc.nextInt();

        System.out.println("enter the Tamil marks : ");
        int Tamil=sc.nextInt();

        if (bengali > 40 && English >40 && Hindi>40 && Urdu>40 && Tamil>40){
            System.out.println("Passed");
        }
        else{
            System.out.println("failed");
        }

    }
}
