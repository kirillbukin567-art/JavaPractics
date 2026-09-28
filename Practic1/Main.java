public class Main {
    public static void main(String[] args) {
        // Создаём объекты с помощью трёх разных конструкторов

        // Конструктор со всеми полями
        Car car1 = new Car("Toyota Camry", "А123БВ777", "Чёрный", 2018);

        // Конструктор по умолчанию
        Car car2 = new Car();

        // Конструктор с выбранными полями (модель и год)
        Car car3 = new Car("Honda Civic", 2020);

        // Проверяем работу метода toString() у каждого объекта
        System.out.println("car1: " + car1.toString());
        System.out.println("car2: " + car2.toString());
        System.out.println("car3: " + car3.toString());

        System.out.println();

        // Проверяем работу сеттеров — меняем поля car2
        car2.setModel("Lada Vesta");
        car2.setLicense("Х456УМ199");
        car2.setColor("Белый");
        car2.setYear(2022);

        System.out.println("car2 после изменения полей: " + car2.toString());

        System.out.println();

        // Проверяем работу геттеров и метода возраста автомобиля
        System.out.println("Модель car1 (getModel): " + car1.getModel());
        System.out.println("Возраст car1 (getAge): " + car1.getAge() + " лет");
        System.out.println("Возраст car3 (getAge): " + car3.getAge() + " лет");
    }
}