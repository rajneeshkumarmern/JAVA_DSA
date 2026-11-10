
package ArrayString;
//6	Check Armstrong number	153 → Armstrong
import java.util.Scanner;

public class Numbers06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        int original = a;
        //Converts the integer into a String.Counts the number of characters.
        int count = String.valueOf(original).length();
        //This variable stores the sum of the powered digits.
        int armstrong = 0;
       //The loop continues until a becomes 0.
        while (a > 0) {
           //The modulus operator % extracts the last digit.
            int digit = a % 10;
            //Because Math.pow() returns a double, but armstrong is an integer. We convert the result into int.
            armstrong = armstrong +
                    (int) Math.pow(digit, count);
// Remove the last digit
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
