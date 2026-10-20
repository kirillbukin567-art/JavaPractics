// Тест Задания 4: массив из пяти фигур
public class TestColorable {
    public static void main(String[] args) {
        // Массив типа GeometricObject может хранить объекты любых наследников
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(2);
        shapes[3] = new Square(5);
        try {
            shapes[4] = new Triangle(3, 4, 5);
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Фигура " + (i + 1) + ": " + shapes[i]);
            System.out.println("Площадь: " + shapes[i].getArea());
            // Если объект умеет раскрашиваться (реализует Colorable) — вызываем howToColor()
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
            System.out.println();
        }
    }
}