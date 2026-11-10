package ArrayString;
//	Sum of digits	123 → 6
import java.util.Scanner;
public class Numbers09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a nums: ");
        int a = in.nextInt();
        int sum = 0;
        while (a > 0) {
                int digit = a%10;
                sum = sum+digit;
                a = a/10;
            }
        System.out.println(sum);

    }
}

