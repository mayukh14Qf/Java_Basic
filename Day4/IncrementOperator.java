package Day4;

public class IncrementOperator {

    public static void main(String[] args) {
        // Increment Operator (UNARY)
        // it increments the value and store value within itself
        // a=a+value
        // a += value
        // a++ ----> a=a+1 ------> a += 1

        int number=10;
        number=number+12;
        System.out.println(number);

        number += 10;
        System.out.println(number);

        number++; // number=number+1
        System.out.println(number);


    }
}
