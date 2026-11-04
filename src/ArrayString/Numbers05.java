package ArrayString;
//5	Check palindrome number	121 → Palindrome
import java.util.Scanner;
public class Numbers05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Nums: ");
        int a = in.nextInt();
        int original = a;
        int palindrome = 0;

        while(a>0) {
            int digit = a % 10;
            palindrome = palindrome * 10 + digit;
            a = a / 10;
        }
            if(palindrome == original) {
                System.out.println("Palindrome: " + palindrome);
            }else{
                System.out.println("not palindrome");
            }
        }

    }

