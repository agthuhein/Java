package src.Day_20_BankAccountManagementSystem_Exercise;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance + overdraftLimit >= amount) {
            System.out.println("Withdrawing " + amount);
            deposit(-amount);
        }
        else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}
