package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class MainPart1 {
    public static void main(String[] args) {
        System.out.println("=== Проверка класса Car ===");
        Car car = new Car("Иван Иванов", "RUS-4521", "Petrol");

        System.out.println("Владелец: " + car.getOwnerName());
        System.out.println("Страховой номер: " + car.getInsuranceNumber());
        System.out.println("Тип двигателя: " + car.getEngineType());

        car.setOwnerName("Пётр Петров");
        System.out.println("Новый владелец после setOwnerName: " + car.getOwnerName());

        System.out.println();
        System.out.println("=== Проверка класса ElectricCar (наследование) ===");
        ElectricCar electricCar = new ElectricCar("Мария Смирнова", "RUS-7788", 75.0);

        System.out.println("Владелец: " + electricCar.getOwnerName());
        System.out.println("Страховой номер: " + electricCar.getInsuranceNumber());
        System.out.println("Тип двигателя (установлен в конструкторе ElectricCar через "
                + "унаследованное protected-поле): " + electricCar.getEngineType());
        System.out.println("Ёмкость аккумулятора: " + electricCar.getBatteryCapacity() + " кВт*ч");
    }
}
/*javac vehicles/Car.java vehicles/ElectricCar.java app/MainPart1.java
java app.MainPart1
*/