package Day6;

public class LastDigitOfANumber {
    public static void main(String[] args) {

        // Number ------ > xyzp
        // xyzp % 10-----> p (last digit)
        // 456987 % 10 ------> 7
        // 1234 % 100 -----> 34 (last 2 digits)
        // 12345 % 1000 ------> 345 (last 3 digits)


        int number=4598;
        int lastDigit=number%10;
        System.out.println(lastDigit);

        System.out.println(1234%100); // 34 (count the number of zeros , those many digits from the last will be printed )
        System.out.println(12345%1000);//345
    }
}
