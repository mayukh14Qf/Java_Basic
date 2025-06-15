package Day14;

public class BasicWhile {
    public static void main(String[] args) {
        /*

        It is used whenever we have Number related problem(*****)


        starting/initiation;

        while(Condition Check / Ending )
        {
        statement;
        Step count;
        }

         */

        // Print sorry for 10 times
        int i=1; // 1  ----> Global Variable
        while (i<=10){  //2
            System.out.println("sorry"); //3
            i=i+1; //4
        }

        // Print 1-10 by using while loop
        int start=1;
        while (start<=10){
            System.out.println(start);
            start++;
        }

        //print 10-1 by using while loop
        int value=10;
        while (value>=1){ // 0>=1 ---->false
            System.out.println(value);
            value--;
        }
    }
}
