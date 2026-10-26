package Conditionals;

import java.util.Scanner;
public class while02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num+=1;
        }

    }

    public static class Factorial {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println(System.in);
            System.out.println("Enter a Nums: ");
            int nums=in.nextInt();
            int factorial = 1;
            int i=1;
            while( i<=nums){
                factorial = factorial*i;
                i++;
            }
            System.out.println(factorial);

        }
    }
}
