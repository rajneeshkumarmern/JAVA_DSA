package Conditionals;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length Width: ");
        int length = in.nextInt();
        int width = in.nextInt();
        double area = length*width;
        System.out.println("Area: " + area);

    }

}
