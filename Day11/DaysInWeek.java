package Day11;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*

        1-----> Sunday ---> Weekend
        2----->Monday   -----> weekday
        3---->Tuesday  -----> weekday
        4---->Wednesday -----> weekday
        5----->Thursday -----> weekday
        6---->Friday -----> weekday
        7---->Saturday ------> Weekend

         */
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your day Number : ");
        int dayNumber= sc.nextInt();

        if (dayNumber== 1 || dayNumber==7){
            System.out.println("This is the Weekend . ");
        }
        else {
            System.out.println("This is the weekday");
        }


    }
}
