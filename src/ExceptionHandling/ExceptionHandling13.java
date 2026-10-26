package ExceptionHandling;

public class  ExceptionHandling13 {
    static void withdraw(int balance, int amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        System.out.println("Withdrawal successful!");


    }
    public static void main (String[] args){
        try {
            withdraw(5000, 100);
        }catch(IllegalArgumentException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
        System.out.println("Program completed");
    }
}