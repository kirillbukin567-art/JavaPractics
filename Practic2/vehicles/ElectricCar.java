package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String model, String license, String color, int year,
                         String ownerName, String insuranceNumber, double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Petrol");
        this.engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return vehicleType() + "{model='" + getModel() + "', license='" + getLicense()
                + "', color='" + getColor() + "', year=" + getYear()
                + ", ownerName='" + getOwnerName() + "', insuranceNumber='" + getInsuranceNumber()
                + "', engineType='" + getEngineType() + "', batteryCapacity=" + batteryCapacity + "}";
    }
}