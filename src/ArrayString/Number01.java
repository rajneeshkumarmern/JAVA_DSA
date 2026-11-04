package ArrayString;
//	Check even or odd
import java.util.Scanner;
public class Number01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a nums: ");
        int a = in.nextInt();
        if(a%2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
