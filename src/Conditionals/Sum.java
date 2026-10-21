//2. Take two numbers and print the sum of both.
package Conditionals;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println(sum);
        in.close();
    }
}



