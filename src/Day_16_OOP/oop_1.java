package src.Day_16_OOP;

public class oop_1 {
    public static void main(String[] args) {
        Car myToyota = new Car();
        myToyota.color = "black";
        myToyota.model = "Toyota";
        myToyota.year = 2020;

        Car myAudi = new Car();
        myAudi.color = "white";
        myAudi.model = "Audi A3";
        myAudi.year = 2020;
        //System.out.println("My Toyota is " + myToyota.color);
        //System.out.println("My Audi is " + myAudi.color);
        myToyota.showDetails();
        myAudi.showDetails();
    }
}
