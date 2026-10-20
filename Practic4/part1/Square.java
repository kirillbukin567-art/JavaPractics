// Квадрат: наследует GeometricObject и реализует интерфейс Colorable (Задание 4)
public class Square extends GeometricObject implements Colorable {
    private double side;

    // Квадрат со стороной 0
    public Square() {
        this.side = 0;
    }

    // Квадрат с указанной стороной
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side;
    }
}