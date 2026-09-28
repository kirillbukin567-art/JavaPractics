import java.util.Scanner;
public class YuanToRoublesV2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайских юанях: ");
        int yuan = input.nextInt(); // сумма денег в китайских юанях

        double roubles = Math.ceil(ROUBLES_PER_YUAN * yuan); // сумма денег в российских рублях

        // Определяем последнюю и предпоследние две цифры, чтобы выбрать
        // правильное окончание слова "юань"
        int lastTwoDigits = yuan % 100;
        int digit = yuan % 10; // последняя цифра

        String word;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            // Исключение: 11-14 всегда "юаней" (одиннадцать юаней, двенадцать юаней...)
            word = "юаней";
        } else if (digit == 1) {
            word = "юань";      // 1, 21, 31... юань
        } else if (digit >= 2 && digit <= 4) {
            word = "юаня";      // 2-4, 22-24... юаня
        } else {
            word = "юаней";     // 0, 5-9, 11-20... юаней
        }

        System.out.println(yuan + " китайских " + word + " составляют " + roubles + " российских рублей.");
    }
}