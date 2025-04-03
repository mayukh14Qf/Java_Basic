package Day4;

public class RelationalOperator {
    public static void main(String[] args) {

        // It Compares two side of the operator
        // l.h.s <------->r.h.s
        // It requires of 2 operands, Binary Operator (10 == 12)
        // eg : ( == , > , >= , < , <= , != )
        // It returns Boolean Value
        // Either True or False

        // 1. Comparison (==)
        System.out.println(10==10);
        System.out.println(10==11);
        int value=4;
        System.out.println(value==8);

        // 2. Greater or equal (>=)
        System.out.println(70>=70);
        System.out.println(10>=7);
        System.out.println(5>=6);

        // 3. Greater(>)
        System.out.println(70>70);
        System.out.println(10>7);
        System.out.println(5>6);

        //4  Less or Equal(<=)
        System.out.println(70<=70);
        System.out.println(10<=7);
        System.out.println(5<=6);

        // Only Less (<)
        System.out.println(70<70);
        System.out.println(10<7);
        System.out.println(5<6);

        // not equal (!=)
        System.out.println(10!=77);
        System.out.println(10!=10);

    }
}
