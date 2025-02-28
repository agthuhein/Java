package src.Day_19_Polymorphism.Abstraction;

public class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing Credit Card Payment amount: " + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing CreditCardPayment");
    }
}
