import java.util.Date;

// Абстрактный класс: общие свойства и поведение всех геометрических фигур.
// Создавать объекты прямо из него нельзя, только из его наследников.
public abstract class GeometricObject {
    private String color = "white";   // цвет (по умолчанию белый)
    private boolean filled;           // закрашена ли фигура
    private Date dateCreated;         // дата и время создания объекта

    // Конструктор без параметров: запоминаем только время создания
    public GeometricObject() {
        dateCreated = new Date();
    }

    // Конструктор с параметрами: задаём цвет и признак заливки
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Для boolean-поля геттер принято называть isХ
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    // Абстрактные методы: у каждой фигуры своя формула, поэтому тел здесь нет
    public abstract double getArea();

    public abstract double getPerimeter();
}