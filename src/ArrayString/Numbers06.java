
package ArrayString;
//6	Check Armstrong number	153 → Armstrong
import java.util.Scanner;

public class Numbers06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        int original = a;
        int count = String.valueOf(original).length();
        int armstrong = 0;

        while (a > 0) {

            int digit = a % 10;

            armstrong = armstrong +
                    (int) Math.pow(digit, count);

            a = a / 10;
        }

        if (original == armstrong) {
            System.out.println("Armstrong: " + armstrong);
        } else {
            System.out.println("Not Armstrong");
        }

        in.close();
    }
}
