package Day17;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        /*

        String ---> Sequence of Characters
        1.1st Index --- > 0
        2. Last Index ----> length-1
        3.String can consist any characters : "mayukhjit"/ "mayukhjit2001"/"mayukhjit2001_@"

        we use multiple functions of string

         */


        // Static Input

        String var1="mayukhjit2001_";
        System.out.println(var1);

        // Find out the length
        System.out.println(var1.length());

        int lengthVar=var1.length();
        System.out.println(lengthVar);

        //Find Out The characters at an index
        System.out.println(var1.charAt(0)); // 1st char
        System.out.println(var1.charAt(lengthVar-1)); // last char

        // Print All Characters / Traverse al the characters of a string
        // Last/termination -----> Last index of the string ( var.length-1)
        for (int i=0;i<=lengthVar-1;i++ ){
            System.out.println(i+" : "+var1.charAt(i));
            /*
            i->0 -----> m
            i->1 -----> a
            ..
            ..
            i->13 ------>_
             */
        }


        // Important (Concatenation)

        System.out.println(2+3); // 5
        System.out.println(2+"3"); // "2"+"3"
        System.out.println("2"+"3"); // This will act as glue  --->23
        /*

        "mayukh" + "jit" ---> "mayukhjit"

         */
        System.out.println(2+2+"3"); //43
        System.out.println(2+"3"+2); //232 ----> "23"+2 ->232
        System.out.println("2"+3+2); // "23"+2 ---> "23"+"2" ---->232




        // Dynamic Input (User Input)
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String var2=sc.nextLine(); // hi mayukhjit

        System.out.println("Enter Your String : ");
        String var3=sc.next(); // hi mayukhjit

        System.out.println(var2);
        System.out.println(var3);

    }
}
