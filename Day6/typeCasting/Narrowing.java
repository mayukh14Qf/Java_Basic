package Day6.typeCasting;

public class Narrowing {
    public static void main(String[] args) {

        // It will be done by the coder manually -----> Explicit Conversion
        // Storing the larger data type value to the smaller datatype variable
                /*

                byte < short < char < int < long <float <double

                 */

        int var1=(int)45.7f;
        int var2=(byte)56.5;  // decimal ----- > float / double

        System.out.println(var1);
        System.out.println(var2);


        int a=10;
        System.out.println(a); // 10
        System.out.println((double) a); // 10.0


        char var3=(char)65;
        System.out.println(var3); // 65 -----> ascii character ----> 'A'


    }
}
