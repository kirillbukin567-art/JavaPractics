package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // 1. Создаём экземпляры Car и ElectricCar
        Car car = new Car("Toyota Camry", "А123БВ777", "Чёрный", 2018,

                "Иван Иванов", "RUS-4521");
        ElectricCar electricCar = new ElectricCar("Tesla Model 3", "Е777КХ777", "Белый", 2023,
                "Мария Смирнова", "RUS-7788", 75.0);

        System.out.println("=== До изменений ===");
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        // 2. Изменяем год выпуска и имя владельца
        car.setYear(2020);
        car.setOwnerName("Пётр Петров");

        // 3. Изменяем страховой номер
        electricCar.setInsuranceNumber("RUS-9999");

        // 4. Получаем информацию о ёмкости батареи электромобиля
        System.out.println();
        System.out.println("Ёмкость батареи electricCar: " + electricCar.getBatteryCapacity() + " кВт*ч");

        // 5. Выводим информацию о транспортных средствах через toString()
        System.out.println();
        System.out.println("=== После изменений ===");
        System.out.println(car.toString());
        System.out.println(electricCar.toString());
    }
}
//javac vehicles/Vehicle.java vehicles/Car.java vehicles/ElectricVehicle.java vehicles/ElectricCar.java app/TestCar.java
//java app.TestCar