package Assignments.BankingSystem;
import java.util.Random;

public class Main {
    public static void chargeAll(Payable[]payments) {
        Random rand = new Random();
        for (Payable p : payments) {
            double amount = 1+ rand.nextInt(100);
            p.pay(amount);
        }
    }

    public static void main(String[] args) {
        Payable[] payables = new Payable[] {
                new CreditCardPayment(),
                new CashPayment(),
                new CreditCardPayment()
        };

        chargeAll(payables);

        payables[0].refund(20);
        payables[1].refund(10);
    }

}
