package src.Day_19_Polymorphism.Abstraction;

public class BankTransferPayment extends Payment {
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing bank transfer payment of amount: " + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing bank transfer transaction and connecting to bank API");
    }
}
