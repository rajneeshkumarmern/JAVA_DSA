package Conditionals;
import java.util.Scanner;
public class AverageN {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a N: ");
    int n = in.nextInt();
    int sum = 0;                    // using while
    for(int i = 1; i<=n; i++){      // int sum = 0;
        int num = in.nextInt();     // int count = 0;
        sum = sum+num;              // while(num!=0){
        }                           // sum = sum+num;
        double avg =(double)sum/n; // count++;
        System.out.println(avg);   //num = in.nextInt();
    }
}
