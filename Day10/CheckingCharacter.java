package Day10;

import java.util.Scanner;

public class CheckingCharacter {
    public static void main(String[] args) {
        /*

        User Input ---> Character
        print ------> Whether it is "Numeric" / "Alphabet" / "Special Character"

        a/b/c....so on
        Alphabet

        1/0/9....so on
        numeric

        &/%/@....so on
        Special Character

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character : ");
        char character=sc.next().charAt(0);

        // to check any range 0-9 ----> && (v.v.v.important)
        if (character >= '0' && character <= '9'){
            System.out.println("Numeric");
        }
        // lower case 'a' --- 'z'
        else if (character >= 'a' && character <= 'z') {
            System.out.println("Alphabet");
        }
        // Upper case 'A' --- 'Z'
        else if (character >= 'A' && character <= 'Z') {
            System.out.println("Alphabet");
        }
        // Special Character
        else {
            System.out.println("Special Character");
        }

    }
}
