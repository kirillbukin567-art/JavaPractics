// Проверка метода max() и сравнения фигур (Задание 3, пункты 5 и 6)
public class TestMax {
    public static void main(String[] args) {
        // --- Пункт 5: max() для двух кругов и для двух прямоугольников ---
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        GeometricObject biggerCircle = GeometricObject.max(c1, c2);
        System.out.println("Больший из двух кругов: " + biggerCircle
                + ", площадь = " + biggerCircle.getArea());

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 8);
        GeometricObject biggerRect = GeometricObject.max(r1, r2);
        System.out.println("Больший из двух прямоугольников: " + biggerRect
                + ", площадь = " + biggerRect.getArea());

        // --- Пункт 6: ComparableCircle и compareTo() ---
        ComparableCircle cc1 = new ComparableCircle(2);
        ComparableCircle cc2 = new ComparableCircle(4);
        if (cc1.compareTo(cc2) > 0) {
            System.out.println("Больший ComparableCircle: cc1, радиус " + cc1.getRadius());
        } else {
            System.out.println("Больший ComparableCircle: cc2, радиус " + cc2.getRadius());
        }

        // Сравнение круга и прямоугольника
        Circle circle = new Circle(2);            // площадь примерно 12.57
        Rectangle rectangle = new Rectangle(3, 5); // площадь 15.0
        int result = circle.compareTo(rectangle);
        if (result > 0) {
            System.out.println("Круг больше прямоугольника");
        } else if (result < 0) {
            System.out.println("Круг меньше прямоугольника");
        } else {
            System.out.println("Площади круга и прямоугольника равны");
        }
    }
}