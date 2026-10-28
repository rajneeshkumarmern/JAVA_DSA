package ExceptionHandling;

public class ExceptionHandling29 {

        static void withdrawl(int balance,int amount) {

            try {
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount not be negative or zero");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (amount > balance) throw new IllegalArgumentException("Insufficient balance");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            int remaining = balance - amount;
            System.out.println(remaining);
        }
                    public static void main(String[] args){

                         withdrawl(5000,7000);
                    }
                }



