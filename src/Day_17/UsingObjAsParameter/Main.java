package src.Day_17.UsingObjAsParameter;

public class Main {
    public static void main(String[] args) {
        Smartphone sp1 = new Smartphone("iPhone 15", "Apple", 1200);
        Smartphone sp2 = new Smartphone("A21", "Samsung", 1100);

        sp1.applyDiscount(20);
        sp1.comparePrice(sp2);
        sp2.comparePrice(sp1);

        sp1.displayDetails();
        sp2.displayDetails();
    }
}
