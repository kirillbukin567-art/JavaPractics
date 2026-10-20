// Треугольник — наследник GeometricObject (Задания 1 и 2)
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Безаргументный конструктор: треугольник со сторонами 1.0, 1.0, 1.0
    public Triangle() {
    }

    // Конструктор с тремя сторонами.
    // throws сообщает: внутри может быть выброшено IllegalTriangleException
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        // Правило: сумма любых двух сторон должна быть больше третьей
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Площадь по формуле Герона: s = (a + b + c) / 2, area = sqrt(s(s-a)(s-b)(s-c))
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2
                + " сторона3 = " + side3;
    }
}