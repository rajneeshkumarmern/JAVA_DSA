package Methods;
import java.util.Scanner;
public class Methods09 {
    static void findMax(int a, int b,int c) {
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
    static void findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("Smallest: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest: " + b);
        } else {
            System.out.println("Smallest: " + c);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Nums: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        findMax(a,b,c);
        findMin(a,b,c);
        in.close();

    }
    }