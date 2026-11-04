
package Collections;

import java.math.BigInteger;
import java.util.Scanner;

public class Collections11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your numbers:");

        try {
            byte a = in.nextByte();
            System.out.println("Byte: " + a);
        } catch (Exception e) {
            System.out.println("Numbers must be in -128 to 127");
            in.nextLine();
        }

        try {
            short b = in.nextShort();
            System.out.println("Short: " + b);
        } catch (Exception e) {
            System.out.println("Numbers must be in -32,768 to 32,767");
            in.nextLine();
        }

        try {
            int c = in.nextInt();
            System.out.println("Int: " + c);
        } catch (Exception e) {
            System.out.println("Numbers must be in -2,147,483,648 to 2,147,483,647");
            in.nextLine();
        }

        try {
            long d = in.nextLong();
            System.out.println("Long: " + d);
        } catch (Exception e) {
            System.out.println("Numbers must be in -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        }

        in.close();
    }

    public static class Collection12 {
        public static void main(String[] args){
             Scanner in = new Scanner(System.in);
             System.out.println("Enter a nums: ");
           BigInteger num = in.nextBigInteger();
           boolean fit = false;
           if(num.compareTo(BigInteger.valueOf(Byte.MIN_VALUE))>=0 &&
                   num.compareTo(BigInteger.valueOf(Byte.MAX_VALUE))<=0){
               System.out.println("Can be stored in byte");
               fit = true;
           }
           if(num.compareTo(BigInteger.valueOf(Short.MIN_VALUE))>=0 &&
           num.compareTo(BigInteger.valueOf(Short.MAX_VALUE))<= 0 ){
               System.out.println("Can be stored in Short");
               fit = true;

           }
           if(num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>=0 &&
                   num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<=0){
               System.out.println("Can be stored in Integer: ");
               fit=true;
           }
            if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("Can be stored in Long");
                fit=true;

            }
            if(!fit) {
                System.out.println("this value  not fit anywhere");
            }
            }
        }
}
