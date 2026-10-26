package Methods;
import java.util.Scanner;
public class Methods10 {

    static void evenOdd(int n){
        if(n%2 == 0){
            System.out.println("Even: " + n);
        }else{
            System.out.println("Odd: " + n);
        }
    }

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a nums: ");
    int n = in.nextInt();
    evenOdd(n);

    }
}