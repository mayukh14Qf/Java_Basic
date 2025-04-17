package Day6.typeCasting;

public class Widening {
    public static void main(String[] args) {
        // It is done by the java automatically
        // Storing the smaller data type value to the larger datatype variable
        /*

        byte < short < char < int < long <float <double

         */

        int var1= 123;
        int var2=78;
        int var3=4568;
        int var4='h'; // it will store the ascii value related to 'h'
        // int var5=45.6f; // it is not possible ( narrowing )

        // ascii value
        int var6='a';
        int var7='=';
        int var8='B';
        int var9='$';

        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);

    }
}
