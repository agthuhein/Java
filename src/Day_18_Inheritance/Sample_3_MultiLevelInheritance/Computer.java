package src.Day_18_Inheritance.Sample_3_MultiLevelInheritance;

public class Computer extends Device{
    int ram;
    int storage;

    Computer(String brand, String model, int ram, int storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
    @Override
    void powerOn() {
        System.out.println("Computer is powering on");
    }
}
