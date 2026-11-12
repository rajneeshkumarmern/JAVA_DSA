//8. Create a custom exception for insufficient bank balance.
package Oop;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient bank balance!"
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankExceptionDemo08 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}