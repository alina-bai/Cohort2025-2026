package Assignments.BankingSystem;

public class CreditCardPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $ "+ amount + "to credit card");
    }
}
