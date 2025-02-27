package src.Day_17.MethodChaining;

public class Main {
    public static void main(String[] args) {
        SmartAppliance appliance1 = new SmartAppliance("Air Conditioner", "Cooling", "On");

        //Creating a new instance
        SmartAppliance appliance2 = appliance1.getInstance();

        //Creating a reference to the other object.
        SmartAppliance appliance3 = appliance1;

        //Method chaining
        appliance1.setApplianceName("Set Air Con").setApplianceType("Cooling mooling").setApplianceType("Off");
        appliance1.displayDetails();
        appliance2.setApplianceName("Air Con 2");
        appliance2.displayDetails();
        System.out.println("-----------------------");
        appliance3.setApplianceName("Air Con 3");
        appliance3.displayDetails();

        appliance1.displayDetails();
    }
}
