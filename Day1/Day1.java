package Day1;

public class Day1 {
    // Comment -----> IDE WILL NOT EXECUTE THAT LINE
    /*
    Multi Line
    Comment
     */
    //public is my access modifier ----- >
    // static means this main belongs to JVM ------>EXECUTE
    // void is return type
    // main is a method name
    // String [] ---> Array
    // args --->variable name
    public static void main(String[] args) {
        System.out.print("Hello......");// Printing Statement
        System.out.print("Hi");
        //println () ----> print the value and send the cursor to next line
        // print() ----->  print the value and keep the cursor in the same line
        System.out.println("hi again");
        System.out.print("namaste......");
        System.out.println("sayonara...");
        // Java is Case Sensitive
        // a-----A (not equal)
        // apple -----****-- APPLE (not equal)
        // keywords---> reserved words or predefined in java/programming
        // eg--> for ,if, System,out,print,public,static
        System.out.printf("my name is %s","Mayuhjit");
        // " My roll number is ______ "(float/integer/String/char)
        // %d ---- > integer
        // %f ------> float
        // %s----- >String
        System.out.printf("My roll number is %d \n",4);
        System.out.printf("my height is %f \n",45.65);
        //"I have _____ books in my _________"
        System.out.printf("I have %d books in my %s",12,"Home");

        // Important Points (*****)
        System.out.println("4+5"); //-------->4+5 (as it is)
        System.out.println(4+5); // ------>9 (Arithmetic operation)
        System.out.println("4"+"5"); //------>45 ( String + String ---->StringString -------> Concatenation(It is like glue)


        System.out.printf("%s \n","mayukhjit");
        System.out.printf("%d \n",10);
        System.out.printf("%f \n",45.56);
        System.out.printf("%c \n",'c');
        // It will print the string but in uppercase
        System.out.printf("%S \n","mayukhjit");
        // .2/.3 --->precision after decimal
        System.out.printf("%.2f \n",45.596);
        System.out.printf("%.3f \n",5.4964);
        System.out.printf("%C",'a');
        System.out.println();
        System.out.println("%s ");

    }
}