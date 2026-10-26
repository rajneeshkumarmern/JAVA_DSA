package Conditionals;
import java.util.Scanner;
public class SumNums {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Nums: ");
        int nums = in.nextInt();
        int sum = 0;
        int i =1;
          while(nums!=0){
              sum = sum+nums;
              nums=in.nextInt();
      }
          System.out.println(sum);
    }
}
