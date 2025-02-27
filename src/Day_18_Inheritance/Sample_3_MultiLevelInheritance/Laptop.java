package src.Day_18_Inheritance.Sample_3_MultiLevelInheritance;

public class Laptop extends Computer{
    double weight;
    double screenSize;

    public Laptop(String brand, String model, int ram, int storage , double weight, double screenSize) {
        super(brand, model, ram, storage);
        this.weight = weight;
        this.screenSize = screenSize;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight);
        System.out.println("Screen Size: " + screenSize);
    }
    @Override
    public void powerOn() {
        System.out.println("Laptop is powering on");
    }
}
