package Day2;

public class ShapeValue_Exercise {
    public static void main(String[] args) {
        double shapeValue = 42.59;
        System.out.println("The shape value is " + shapeValue);

        System.out.println("Transforming shapes.... ");

        int intShape = (int) shapeValue;
        System.out.println("Transform into int: " + intShape);

        long longShape = (long) shapeValue;
        System.out.println("Transform into long: " + longShape);

        float floatShape = (float) shapeValue;
        System.out.println("Transform into float: " + floatShape);
    }
}
