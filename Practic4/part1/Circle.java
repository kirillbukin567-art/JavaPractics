// Круг — наследник GeometricObject
public class Circle extends GeometricObject {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);   // цвет и заливку принимает родительский конструктор
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.println("Круг создан " + getDateCreated() + ", радиус " + radius);
    }

    @Override
    public String toString() {
        return "Круг: радиус = " + radius;
    }
}