// Круг с радиусом. Реализует Comparable<Circle>, чтобы круги можно было сравнивать
public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Круг "больше", если у него больше радиус
    @Override
    public int compareTo(Circle o) {
        return Double.compare(radius, o.radius);
    }

    @Override
    public String toString() {
        return "Круг (радиус = " + radius + ")";
    }
}