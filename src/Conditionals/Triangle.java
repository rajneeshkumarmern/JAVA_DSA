package Conditionals;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Base Height: ");
        int base = in.nextInt();
        int height = in.nextInt();
        int mul = base*height;
        int div = mul/2;
        System.out.println(div);
    }

}
