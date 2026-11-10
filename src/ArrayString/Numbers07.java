package ArrayString;

import java.util.Scanner;

public class Numbers07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = in.nextInt();
        //Initialize factorial = 1 because we are multiplying.
        //i starts from 1.
        //Multiply the previous factorial value by i.
        //Store the updated result in factorial.
        //Print the final result after the loop.
        int factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);

        in.close();
    }
}