package Day17;

public class StringFunctions {
    public static void main(String[] args) {

        /*
        String In built Functions :
         */
        String s="mayukhJIT";

        // Convert All the characters in the upper case
        System.out.println(s.toUpperCase());

        // Convert All the characters in the lower case
        System.out.println(s.toLowerCase());

        // Concat 2 strings
        System.out.println("Mayukhjit"+" Chakraborty");
        System.out.println(s.concat(" Hello"));

        System.out.println("mayukh".length());

        // Check those characters are present at the end of the string or not ----> boolean
        System.out.println(s.endsWith("May")); //false
        System.out.println(s.endsWith("IT")); //true
        System.out.println(s.endsWith("T")); //true

        // Check the characters are present at the starting or not
        System.out.println(s.startsWith("May")); //False
        System.out.println(s.startsWith("may")); //true
        System.out.println(s.startsWith("ab")); //false
        System.out.println(s.startsWith("m")); //true

    }
}
