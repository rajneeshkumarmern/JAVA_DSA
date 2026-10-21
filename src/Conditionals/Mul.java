//3. Take a number as input and print the multiplication table for it.
package Conditionals;
import java.util.Scanner;
public class Mul {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = in.nextInt();
        for(int i = 1; i<=10; i++){
            int mul = num*i;
            System.out.println(mul);
        }
    }
}

