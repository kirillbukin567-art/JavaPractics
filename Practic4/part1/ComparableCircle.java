// Круг, который умеет сравниваться с любой фигурой по площади (Задание 3, пункт 6).
// Comparable<GeometricObject> — тот же интерфейс, что и у GeometricObject.
public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    public ComparableCircle(double radius) {
        super(radius);   // передаём радиус в конструктор Circle
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }
}