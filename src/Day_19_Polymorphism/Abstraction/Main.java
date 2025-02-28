package src.Day_19_Polymorphism.Abstraction;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PaypalPayment();
        Payment bankTransferPayment = new BankTransferPayment();

        creditCardPayment.processPayment(100.00);
        payPalPayment.processPayment(500.00);
        bankTransferPayment.processPayment(1000.00);
    }
}
