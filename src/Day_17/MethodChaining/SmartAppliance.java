package src.Day_17.MethodChaining;

public class SmartAppliance {
    private String applianceName;
    private String applianceType;
    private String powerStatus;

    public SmartAppliance(String applianceName, String applianceType, String powerStatus) {
        this.applianceName = applianceName;
        this.applianceType = applianceType;
        this.powerStatus = powerStatus;
    }

    public SmartAppliance setApplianceName(String applianceName) {
        this.applianceName = applianceName;
        return this;
    }

    public SmartAppliance setApplianceType(String applianceType) {
        this.applianceType = applianceType;
        return this;
    }

    public SmartAppliance setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }

    public SmartAppliance getInstance(){
        return this;
    }
    public void displayDetails() {
        System.out.println("Appliance Name: " + applianceName);
        System.out.println("Appliance Type: " + applianceType);
        System.out.println("Power Status: " + powerStatus);
    }
}
