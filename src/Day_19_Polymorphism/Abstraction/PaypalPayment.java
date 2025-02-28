package src.Day_19_Polymorphism.Abstraction;

public class PaypalPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing PayPal Payment. $" + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing Paypal transaction and connecting to PayPal API");
    }
}
