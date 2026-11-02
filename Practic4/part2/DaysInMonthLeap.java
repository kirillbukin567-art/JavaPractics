import java.util.InputMismatchException;
import java.util.Scanner;

// Часть 2, Задание 2: то же, но для февраля запрашиваем год и учитываем високосный год
public class DaysInMonthLeap {

    // Метод проверяет, является ли год високосным
    public static boolean isLeapYear(int year) {
        // Високосный: делится на 4, но не на 100 — либо делится на 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
ja
    // Метод читает целое число; если введено не целое — просит повторить
    public static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести именно целое число. Попробуйте ещё раз.");
                input.next();   // выбрасываем неверный ввод
            }
        }
    }

    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        int number = readInt(input, "Введите номер месяца (целое число от 1 до 12): ");

        try {
            String name = months[number - 1];
            int days = dom[number - 1];

            if (number == 2) {                       // февраль
                int year = readInt(input, "Введите год: ");
                if (isLeapYear(year)) {
                    days = 29;                       // в високосном году в феврале 29 дней
                }
                System.out.println(name + " " + year + " — " + days + " дн.");
            } else {
                System.out.println(name + " — " + days + " дн.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}