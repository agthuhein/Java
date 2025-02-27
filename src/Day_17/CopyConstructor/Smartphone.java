package src.Day_17.CopyConstructor;

public class Smartphone {
    private String model;
    private String brand;
    private double price;

    public Smartphone(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
    //Copy constructor
    public Smartphone(Smartphone mySmartphone) {
        this.model = mySmartphone.model;
        this.brand = mySmartphone.brand;
        this.price = mySmartphone.price;
    }
    public void applyDiscount(double discountPercentage) {
        this.price -= this.price * (discountPercentage / 100);
    }
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    public void comparePrice(Smartphone otherSmartphone) {
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
