package src.Day_17;

public class Main {
    public static void main(String[] args) {
        SmartAppliance_Sample appliance1 = new SmartAppliance_Sample("Air Conditioner", "Cooling", "On");

        //Creating a new instance
        SmartAppliance_Sample appliance2 = appliance1.getInstance();

        //Creating a reference to the other object.
        SmartAppliance_Sample appliance3 = appliance1;

        appliance2.applianceName = "Air Con2";
        appliance2.displayDetails();
        System.out.println("-----------------------");
        appliance3.applianceName = "Air Con3";
        appliance3.displayDetails();

        appliance1.displayDetails();
    }
}
