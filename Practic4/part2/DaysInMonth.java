import java.util.InputMismatchException;
import java.util.Scanner;

// Часть 2, Задание 1: номер месяца -> название месяца и количество дней
public class DaysInMonth {
    public static void main(String[] args) {
        // Два массива: названия месяцев и количество дней в них
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean ok = false;

        // Повторяем ввод, пока пользователь не введёт целое число
        while (!ok) {
            System.out.print("Введите номер месяца (целое число от 1 до 12): ");
            try {
                number = input.nextInt();   // здесь может возникнуть InputMismatchException
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести именно целое число. Попробуйте ещё раз.");
                input.next();               // убираем неверный ввод, иначе цикл зациклится
            }
        }

        try {
            // Номер месяца минус 1 — индекс в массиве. Для 0, 13, -5 и т.п. возникнет исключение
            System.out.println(months[number - 1] + " — " + dom[number - 1] + " дн.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}