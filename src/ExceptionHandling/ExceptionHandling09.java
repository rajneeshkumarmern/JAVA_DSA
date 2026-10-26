package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling09 {
    public static void main (String[] args){
        int balance = 5000;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Withdrawal: ");
        int withdrawal = in.nextInt();
        int remaining= balance-withdrawal;
        try {
            if (withdrawal > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            System.out.println("Withdrawal successful");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
           System.out.println("Remaining Balance: " + remaining);
            System.out.println("Transaction completed");
        }
    }

