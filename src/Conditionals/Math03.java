package Conditionals;

import java.util.Scanner;
public class Math03 {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in) ;
     System.out.println("Enter a number: ");
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();

     int max = Math.max(c,Math.max(a,b));
     System.out.println(max);
    }
}
