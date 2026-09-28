public class Car1 {
    // Поля класса (свойства объекта)
    private String model;
    private String license;
    private String color;
    private int year;

    // Константа: текущий год, от которого считается возраст автомобиля
    private static final int CURRENT_YEAR = 2026;

    // 1) Конструктор со всеми полями класса
    public Car1(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // 2) Конструктор по умолчанию (без аргументов)
    public Car1() {
        this.model = "Неизвестно";
        this.license = "Неизвестно";
        this.color = "Неизвестно";
        this.year = CURRENT_YEAR;
    }

    // 3) Конструктор с полями по выбору студента (модель и год выпуска)
    public Car1(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "Не указан";
        this.color = "Не указан";
    }

    // ===== Геттеры и сеттеры для всех полей =====

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод, возвращающий возраст автомобиля (в годах)
    public int getAge() {
        return CURRENT_YEAR - year;
    }

    // Метод toString() — выводит значения полей объекта
    // (в задании назван "To_String()", в Java принято переопределять
    // стандартный метод toString(), который вызывается автоматически
    // при попытке вывести объект через println)
    @Override
    public String toString() {
        return "Car{model='" + model + "', license='" + license
                + "', color='" + color + "', year=" + year + "}";
    }
}