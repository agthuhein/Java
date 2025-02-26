package src.Day_16_OOP;

public class Car {

    //Properties or attributes
    private String brand;
    String color;
    String model;
    int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Car()
    {

    }
    public Car(String brand){
        this.brand = brand;
    }

    public void showDetails() {
        System.out.println("This car is a " + model + " and is "+ color + " and was built in " + year);
    }

    //Default access modifier.
    //It can access from all the class from the same package.
    void drive(){
        System.out.println("I'm going to drive");
    }
    //This can only be used by CAR class
    private void park(){
        System.out.println("I'm going to park");
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
    }
}
