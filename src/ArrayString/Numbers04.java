package ArrayString;
//Reverse a number	1234 → 4321
import java.util.Scanner;
public class Numbers04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int n = in.nextInt();
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse number " + reverse);
    }

}