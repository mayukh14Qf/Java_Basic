package Day10;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        // char input ------> Vowel Or Not

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Alphabet : (small letter) ");
        char alpha=sc.next().charAt(0);

        if (alpha=='a' || alpha=='e' || alpha=='i'
                || alpha=='o'|| alpha=='u')
        {
            System.out.println("Vowel...");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
