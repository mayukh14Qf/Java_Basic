package Day6;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle=4568.56;
        double time=2;
        double rateOfInterest=5;

        double simpleInterest=(principle*rateOfInterest*time)/100;
        System.out.println(simpleInterest);
        System.out.printf("simple Interest is :  %.2f",simpleInterest);
    }
}
