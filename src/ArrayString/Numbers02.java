package ArrayString;
import java.util.Scanner;
public class Numbers02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = in.nextInt();
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        }else{
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
