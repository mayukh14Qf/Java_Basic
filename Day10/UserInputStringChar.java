package Day10;

import java.util.Scanner;

public class UserInputStringChar {
    public static void main(String[] args) {

        // Numeric ------- > sc.nextInt()/sc.nextDouble()/sc.nextByte().....etc
        // Boolean-------> sc.nextBoolean()
        // String ------> sc.nextLine()/sc.next()
        // char -------> sc.next.charAt(0)

        String var= "my name is mayukhjit"; // Sentence
        String var1="Mayukhjit"; // word


        // Whole sentence,Single Word ----> nextLine()
        // word ------> next()

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any sentence ");
        String var5=sc.nextLine();

        System.out.println("--------Output----------");
        System.out.println(var5);

        System.out.println("Enter your name  : ");
        String var6=sc.next();

        System.out.println(var6);

        // char ------> sc.next().chatAt(0)
        /*
        sc.next()--->word.charAt(0)--->1st Character of the word
         */
        char var3='+'; // Any single Character
        char var4='h';

        System.out.println("Enter Your Character : ");
        char var7=sc.next().charAt(0);

        System.out.println(var7);

    }
}
