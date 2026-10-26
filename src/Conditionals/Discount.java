package Conditionals;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Price Discount: ");
        int price = in.nextInt();
        int discount = in.nextInt();

        double disamount = (double)price*discount/100;
        double finalprice = (double)price-disamount;
        System.out.println(finalprice);
    }
}
