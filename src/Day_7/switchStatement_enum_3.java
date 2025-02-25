package Day_7;

public class switchStatement_enum_3 {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public enum CoffeeSize{
        SMALL,MEDIUM,LARGE
    }

    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.LARGE;
        double price = 0;

        switch (size){
            case SMALL:
                price = 2.50;
                break;
            case MEDIUM:
                price = 3.50;
                break;
            case LARGE:
                price = 5.50;
                break;
        }
        System.out.printf("The price for your coffee is: $%.2f%n", price);

    }
}
