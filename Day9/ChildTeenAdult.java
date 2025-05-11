package Day9;

import java.util.Scanner;

public class ChildTeenAdult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        int age=sc.nextInt();

        //    1.Age below 13 -----> child
        //    2. age ---->13 to 19 ----->Teenager
        //    3. above 19 ------->Adult

        // range-----> 10 - 20 -----> using logical And (&&)

        if (age<13)
        {
            System.out.println("you are a child");
        }
        else if (age>=13 && age <=19){
            System.out.println("you are a teenager");
        }
        else {
            System.out.println("you are an adult");
        }

    }
}
