package Day4;

public class DecrementOperator {
    public static void main(String[] args) {
        // Decrements the value and store it to itself
        // a = a-value;
        // a -= value;'
        // a-- -----> a=a-1 ------> a -= 1

        float num=2.45f;

        num=num-1.1f;
        System.out.println(num);

        num -=0.02f;
        System.out.println(num);

        num--; //num=num-1.0f;
        System.out.println(num);

    }
}
