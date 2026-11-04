
package Collections;

import java.util.Scanner;
import java.math.BigInteger;

public class Collections12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            BigInteger num = in.nextBigInteger();

            boolean fits = false;

            System.out.println(num + " can be fitted in:");

            if (num.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {

                System.out.println("* byte");
                fits = true;
            }

            if (num.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {

                System.out.println("* short");
                fits = true;
            }

            if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {

                System.out.println("* int");
                fits = true;
            }

            if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {

                System.out.println("* long");
                fits = true;
            }

            if (!fits) {
                System.out.println(num + " can't be fitted anywhere.");
            }
        }

        in.close();
    }
}
