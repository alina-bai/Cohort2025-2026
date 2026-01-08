////AExercise 6: Constructor overloading and this keyword.
//public class BankAccountExtended extends  BankAccount{
//    public BankAccountExtended(){
//        this(accountNumber: "Default-001", ownerName: "Unknown"; balance: 0.0);
//    }
//    public BankAccountExtended(String ownerName) {
//        this(generateAccountNumber(), ownerName, balance: 0,0);
//    }
//    public BankAccountExtended(String ownerName, double balance) {
//        this(generateAccountNumber(), ownerName, balance);
//    }
//
//    public BankAccountExtended(String accountNumber, String ownerName, double balance) {
//        super(accountNumber,ownerName,balance);
//    }
//    private static String generateAccountNumber (){
//        return "ACC-" + System.currentTimeMillis() % 100000;
//    }
//}
//
////Exercise 7: Inharitance and Overriding
//static class SavingAccount extends BankAccount{
//    private double interestRate;
//
//    public SavingAccount(String accountNumber, String ownerName, double balance, double interestRate){
//        super(accountNumber, ownerName, balance);
//        this.interestRate = interestRate;
//    }
//
//    public double getInterestRate() {
//        return interestRate;
//    }
//
//    public void setInterestRate(double interestRate) {
//        this.interestRate = interestRate;
//    }
//    public double calculateMonthlyInterest () {
//        return getBalance() *(interestRate/12/100);
//    }
//    public void applyInterest(){
//        double interest = calculateMonthlyInterest();
//        deposit(interest);
//    }
//    @Override
//    public String toString(){
//        return  super.toString() + String.format(", Interest Rate: %.2f%%", interestRate)
//    }
//}
