package src.Day_19_Polymorphism.Abstraction;

abstract public class Payment {
    abstract void processPayment(double amount);
    abstract void initializeTransaction();

    //Concrete Methods
    void confirmPayment(){
        System.out.println("Payment confirmed");
    }
}
