package ArrayString;
//Swap two numbers	10, 20 → 20, 10
import java.util.Scanner;
public class Numbers11 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a nums: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int next = a;
        a = b;
        b = next;
        System.out.println("After Swaping");
        System.out.println("a: :" + a);
        System.out.println("b: " + b);

    }
}
