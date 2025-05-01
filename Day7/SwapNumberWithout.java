package Day7;

public class SwapNumberWithout {
    public static void main(String[] args) {
        // a----> 10
        // b----> 20

        // a-----> 20
        // b------>10

        // Without Third Variable
        // Addition-Subtraction Method
        int a=10;   // static input
        int b=20;


        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);



        // Division-Multiplication

        int x=10;
        int y=70;
        // '+'--->'*'
        // '-'---->/
        x=x*y;
        y=x/y;
        x=x/y;

        System.out.println(x);
        System.out.println(y);

    }
}
