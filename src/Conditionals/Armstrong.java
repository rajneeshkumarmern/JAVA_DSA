package Conditionals;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a N: ");
        int n = in.nextInt();
        int sum = 0;
       for(int i = 1; i<=n; i++){
           int nums = in.nextInt();
           int last = nums%10;
           sum = sum+last*last*last;
           //int nums = nums/10;
       }
       System.out.println(sum);
        }
    }

