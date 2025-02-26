package src.Day_17.UsingObjAsParameter;

public class Smartphone_Sample {
    private String model;
    private String brand;
    private double price;

    public Smartphone_Sample(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        this.price -= this.price * (discountPercentage / 100);
    }
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    public void comparePrice(Smartphone_Sample otherSmartphone) {
        if(this.price < otherSmartphone.price) {
            System.out.println(this.model +" is cheaper than " + otherSmartphone.model);
        }
        else if(this.price > otherSmartphone.price) {
            System.out.println(this.model + " is more expensive than " + otherSmartphone.model);
        }
        else {
            System.out.println(this.model + " is as expensive as " + otherSmartphone.model);
        }
    }
}
