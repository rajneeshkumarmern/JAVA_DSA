//6. Create an interface and implement it.
package Oop;

interface Payment {

    void pay(double amount);
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment through UPI: " + amount);
    }
}

public class InterfaceDemo06 {

    public static void main(String[] args) {

        UpiPayment upi = new UpiPayment();

        upi.pay(1500);
    }
}