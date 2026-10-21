package Conditionals;
import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int limit = Math.min(a,b);
        int hcf = 1;
        for(int i = 1; i<=limit; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);

        int lcm = a*b/hcf;
        System.out.println("LCM = " + lcm);
    }
}

