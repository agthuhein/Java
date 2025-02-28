package src.Day_23_Exception_Handling;

public class Exception_Propagation {
    public static void main(String[] args) {
        try{
            processOrder();
        }catch (Exception e) {
            //Catching the propagated exception in the main method.
            System.out.println("Exception caught in main: " + e.getMessage());
        }

    }
    public static void processOrder() throws Exception{
        calculateTotalPrice();
    }
    public static void calculateTotalPrice() throws Exception {
        checkInventory();
    }
    public static void checkInventory() throws Exception {
        throw new Exception("Insufficient inventory for the order.");
    }
}
