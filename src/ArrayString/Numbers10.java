package ArrayString;
//	Count digits	12345 → 5
import java.util.Scanner;
public class Numbers10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
            int a = in.nextInt();
            int count = String.valueOf(a).length();
            System.out.println(count);
        }
    }

