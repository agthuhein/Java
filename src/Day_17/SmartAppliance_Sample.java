package src.Day_17;

public class SmartAppliance_Sample {
    String applianceName;
    String applianceType;
    String powerStatus;

    public SmartAppliance_Sample(String applianceName, String applianceType, String powerStatus) {
        this.applianceName = applianceName;
        this.applianceType = applianceType;
        this.powerStatus = powerStatus;
    }
    public SmartAppliance_Sample getInstance(){
        return this;
    }
    public void displayDetails() {
        System.out.println("Appliance Name: " + applianceName);
        System.out.println("Appliance Type: " + applianceType);
        System.out.println("Power Status: " + powerStatus);
    }
}
