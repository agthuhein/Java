package src.Day_17.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Smartphone sp1 = new Smartphone("iPhone 15", "Apple", 1200);
        Smartphone sp2 = new Smartphone("A21", "Samsung", 1100);
        Smartphone sp3 = new Smartphone(sp2);

        sp3.applyDiscount(20);

        sp2.comparePrice(sp3);

        sp1.displayDetails();
        sp2.displayDetails();
        sp3.displayDetails();
    }
}
