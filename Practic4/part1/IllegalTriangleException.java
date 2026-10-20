// Собственное (пользовательское) исключение: Exception — его родитель.
// Это проверяемое исключение: компилятор заставит его обработать или объявить через throws.
public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double side1, double side2, double side3) {
        // super(...) передаёт текст сообщения в родительский класс Exception
        super("Недопустимый треугольник со сторонами " + side1 + ", " + side2 + ", " + side3
                + ": сумма длин любых двух сторон должна быть больше длины третьей стороны");
    }
}