package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private double batteryCapacity;

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber, double batteryCapacity) {
        // Car по умолчанию ставит "Combustion"...
        super(model, license, color, year, ownerName, insuranceNumber);
        // ...а здесь, через protected-поле родителя, меняем на "Electric"
        this.engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    // ===== Методы интерфейса ElectricVehicle =====
    @Override
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
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