package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // Объекты хранятся через ссылки на родительский (абстрактный) тип Vehicle —
        // это и есть полиморфизм: конкретный класс объекта определяется в рантайме
        Vehicle car = new Car("Toyota Camry", "А123БВ777", "Чёрный", 2018,
                "Иван Иванов", "RUS-4521", "Petrol");
        Vehicle electricCar = new ElectricCar("Tesla Model 3", "Е777КХ777", "Белый", 2023,
                "Мария Смирнова", "RUS-7788", 75.0);

        // Изменяем свойства через сеттеры, унаследованные от Vehicle
        car.setColor("Синий");
        electricCar.setOwnerName("Пётр Петров");

        // Хотя обе переменные имеют тип Vehicle, при вызове vehicleType() и toString()
        // выполняется код именно того класса, которому реально принадлежит объект
        // (динамическое связывание методов)
        System.out.println("Тип: " + car.vehicleType());
        System.out.println(car.toString());

        System.out.println();

        System.out.println("Тип: " + electricCar.vehicleType());
        System.out.println(electricCar.toString());

        System.out.println();

        // Поле batteryCapacity есть только у ElectricCar, поэтому через ссылку Vehicle
        // напрямую к нему не обратиться — нужно явное приведение типа
        if (electricCar instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) electricCar;
            System.out.println("Ёмкость аккумулятора: " + ec.getBatteryCapacity() + " кВт*ч");
        }
    }
}