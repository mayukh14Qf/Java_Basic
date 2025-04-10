package Day5;

public class LogicalOperator {
    public static void main(String[] args) {
        // Logical AND
        //------> If only one condition is false ----> whole output is false
        System.out.println(10>10 && 5==5);
        System.out.println(true && false);
        System.out.println(10>=10 && 11!=10 && 10==12);
        // Logical OR
        //---->If only one condition is true---->whole output is true
        System.out.println(true || false ||false);
        System.out.println(10!=10 || 11>=11 || 10==9);
        // LOGICAL NOT
        //It reverses the actual boolean output
        //true---->false ; false----> true
        System.out.println(!true);
        System.out.println(!false);
        boolean var=!(!(!(10==11) && (11>=12) && !(13==13)));
        System.out.println(var);

        // Multiple logical operators altogether

        // First pair all and operators
        //precedence of and >>>> precedence of or
        System.out.println(false && false || true);
        System.out.println(true || true && false);
        System.out.println(true || false && true);
        System.out.println(false || false && true);
    }
}
