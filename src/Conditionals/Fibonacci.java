package Conditionals;
import java.util.Scanner;
public class Fibonacci {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the n: ");
       int n = in.nextInt();
       int a = 0;
       int b = 1;
       int count = 2;
       for(int i = 0; i<=n; i++){
          int temp = b;
          b=b+a;
          a= temp;
          count++;

       }
       System.out.println(b);
   }
}
