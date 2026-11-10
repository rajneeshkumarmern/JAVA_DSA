package ArrayString;
//Fibonacci series	0, 1, 1, 2, 3...
import java.util.Scanner;
public class Numbers08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a nums: ");
        int a = in.nextInt();
        int first = 0;
        int second = 1;
        for(int i =0; i<a; i++){
            int next = first+second;
            first = second;
            second = next;
            System.out.println(first);
        }

    }
}
