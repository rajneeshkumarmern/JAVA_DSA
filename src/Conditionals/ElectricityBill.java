package Conditionals;
import java.util.Scanner;
public class ElectricityBill {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Watt Time: ");
        int watt = in.nextInt();
        int time = in.nextInt();
        double unit = (watt * time) / 1000.0;
        double price = 6 * unit;

        System.out.println(price);
    }
}


