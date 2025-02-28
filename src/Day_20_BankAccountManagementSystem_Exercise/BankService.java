package src.Day_20_BankAccountManagementSystem_Exercise;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private List<BankAccount> account;
    private InputUtils inputUtils;

    public BankService() {
        this.account = new ArrayList<>();
        this.inputUtils = new InputUtils();
    }

    public void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = inputUtils.readString();
        System.out.print("Enter initial balance: ");
        double initialBalance = inputUtils.readDouble();

        System.out.println("Select account type: ");
        System.out.println("1 - Savings Account");
        System.out.println("2 - Current Account");
        System.out.print("Enter your choice: ");

        int choice = inputUtils.readInt();

        switch (choice) {
            case 1:
                account.add(new SavingsAccount(accountNumber, initialBalance));
                break;
            case 2:
                System.out.println("Enter overdraft limit: ");
                double overdraftLimit = inputUtils.readDouble();
                account.add(new CurrentAccount(accountNumber, initialBalance, overdraftLimit));
                break;
            default:
                System.out.println("Invalid account type.");
        }
        System.out.print("Account created successfully. ");
    }
    public void depositMoney() {
        BankAccount account = findAccount();
        if(account != null) {
            System.out.println("Enter amount to deposit: ");
            double depositAmount = inputUtils.readDouble();
            account.deposit(depositAmount);
        }
    }
    public void withdrawMoney() {
        BankAccount account = findAccount();
        if(account != null) {
            System.out.println("Enter amount to withdraw: ");
            double withdrawAmount = inputUtils.readDouble();
            account.withdraw(withdrawAmount);
        }
    }
    public BankAccount findAccount() {
        System.out.println("Enter account number: ");
        String accountNumber = inputUtils.readString();
        for (BankAccount account : account) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
    public void checkBalance(){
        BankAccount account = findAccount();
        if(account != null){
            System.out.println("Current balance is " + account.getBalance());
        }
    }
}
