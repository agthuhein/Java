package src.Day_16_OOP;

public class oop_3_constructor {
    public static void main(String[] args) {
        SmartDevice smartDevice_1 = new SmartDevice();
        smartDevice_1.displayStatus();

        System.out.println("###################");

        SmartDevice smartDevice_2 = new SmartDevice("Apple","iPhone 16");
        smartDevice_2.displayStatus();

        System.out.println("###################");

        SmartDevice smartDevice_3 = new SmartDevice("Samsung", "A3", 60);
        smartDevice_3.displayStatus();

    }
}
