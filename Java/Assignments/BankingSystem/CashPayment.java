package Assignments.BankingSystem;

public  class CashPayment implements Payable{
    @Override
    public void pay (double amount) {
        System.out.println("Processing cash payment of $ " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + "in cash.");
    }
}
