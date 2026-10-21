//1. Input a year and find whether it is a leap year or not.
package Conditionals;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = in.nextInt();

        if(year%400==0 || year%4==0 && year%100!=0 ){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}

