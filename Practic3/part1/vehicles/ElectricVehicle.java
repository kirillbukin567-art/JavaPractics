package vehicles;

// Интерфейс описывает, что должен уметь любой электромобиль.
// Тела методов здесь нет — их пишет класс, который реализует интерфейс.
public interface ElectricVehicle {
    double getBatteryCapacity();

    void setBatteryCapacity(double batteryCapacity);
}