package ArrayString;
//Swap two numbers without third veriables	10, 20 → 20, 10
import java.util.Scanner;
public class Numbers12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a nums: ");
        int a = in.nextInt();// 10
        int b = in.nextInt();//20
        a = a+b;// a 30 b 20
        b = a-b; // 20-10 b 10
        a = a-b; //30-10 a= 20
        System.out.println("After Swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

}
