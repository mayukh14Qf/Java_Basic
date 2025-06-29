package Day16;

public class MathFunction {
    public static void main(String[] args) {

        /*

        Built in class ---> Math
        syntax:
          Math.max(a,b) --> find the maximum
          Math.min(a,b) ---> find the minimum
          Math.pow(a,b) ---> find power (a^b)
          Math.abs(-a) ---> neg to pos
          Math.floor(a) --> decimal to int lower
          Math.ceil(b) --> decimal to int upper
          Math.sqrt(b) --> square root of a number
         */


        System.out.println(Math.max(34,78));
        System.out.println(Math.max(23.4,11.5));
        System.out.println(Math.max(23,67.89));

        int findMax=Math.max(23,67);
        System.out.println(findMax);
        System.out.println("-----------------");

        System.out.println(Math.min(23,5));
        System.out.println(Math.min(-45,1));
        System.out.println(Math.min(32.7,121.4));

        int findMin=Math.min(23,67);
        System.out.println(findMin);
        System.out.println("-----------------");

        System.out.println(Math.pow(2,3));// 2^3 -->8
        System.out.println(Math.pow(10,3)); //10^3 -->1000
        System.out.println((int)Math.pow(10,3));
        System.out.println("_______________");

        System.out.println(Math.abs(-19.6));
        System.out.println(Math.abs(-23));
        System.out.println("_______________");

        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(81));
        System.out.println((int)Math.sqrt(25));
        System.out.println("_______________");

        System.out.println(Math.floor(12.36)); //12.0
        System.out.println(Math.floor(12.31)); //12.0
        System.out.println(Math.floor(13.99)); //13.0
        System.out.println("__________________");

        System.out.println(Math.ceil(13.99)); //14.0
        System.out.println(Math.ceil(12.34)); //13.0
        System.out.println("________________");

    }
}
