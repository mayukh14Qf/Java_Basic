package Day7;

import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
        // Dynamic Input ------> During Execution Time we will store the value of the variables
        // "User Input"
        Scanner sc= new Scanner(System.in); // It will help us to  take user input

        // Short - Byte - int - long
        // double - float
        // Integer

        // step 1. (Guide the user )
        System.out.println("Enter Number 1 : ");
        // step 2. ( Use the variable with sc )
        int numberOne=sc.nextInt();
        System.out.println(numberOne);

        // double
        System.out.println("Enter a double value : ");
        double var=sc.nextDouble();

        // Byte
        System.out.println("Enter a Byte value : ");
        byte varByte=sc.nextByte();

        // float
        System.out.println("Enter the float value : ");
        float var3= sc.nextFloat();

        System.out.println(var3);
        System.out.println(var);
        System.out.println(varByte);
    }
}
