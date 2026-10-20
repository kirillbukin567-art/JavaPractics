import java.util.Locale;
import java.util.Scanner;

// Клиентская программа для Triangle (Задания 1, 2 и 3)
public class TestTriangle {
    public static void main(String[] args) {
        // Locale.US: дробные числа вводим через точку (3.5), а не через запятую
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите сторону 1: ");
        double side1 = input.nextDouble();
        System.out.print("Введите сторону 2: ");
        double side2 = input.nextDouble();
        System.out.print("Введите сторону 3: ");
        double side3 = input.nextDouble();
        System.out.print("Введите цвет: ");
        String color = input.next();
        System.out.print("Треугольник закрашен? (true/false): ");
        boolean filled = input.nextBoolean();

        // Конструктор Triangle может выбросить проверяемое исключение,
        // поэтому создание объекта обязательно находится внутри try
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            // Сюда попадаем, если стороны не образуют треугольник
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}