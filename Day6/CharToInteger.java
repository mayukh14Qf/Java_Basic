package Day6;

public class CharToInteger {
    public static void main(String[] args) {
        char var= 'a';
        int result= var; // widening
        System.out.println(result);

        // Easy Approach
        System.out.println((int)'a'); // widening
    }
}
