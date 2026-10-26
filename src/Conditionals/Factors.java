package Conditionals;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Nums: ");
        int nums= in.nextInt();
        for(int i = 1; i<=nums; i++){
            if(nums%i==0){
                System.out.println(i);
            }
        }
    }
}
