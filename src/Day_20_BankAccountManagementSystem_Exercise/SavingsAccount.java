package src.Day_20_BankAccountManagementSystem_Exercise;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance >= amount) {
            System.out.println("Withdrawing:" + amount);
            deposit(-amount);
        }
        else {
            System.out.println("Not enough money");
        }
    }
}
