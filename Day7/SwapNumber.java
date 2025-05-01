package Day7;

public class SwapNumber {
    public static void main(String[] args) {
        // a----> 10
        // b----> 20

        // a-----> 20
        // b------>10

        // With Third Variable

        int a=10;
        int b=20;

        int c=a;
        a=b;
        b=c;

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);

    }
}
