package Conditionals;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        int radius = in.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }
}
