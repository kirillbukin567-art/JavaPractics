//Задание 1.1
import java.util.Scanner;
public class YuanToRoubles {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайских юанях: ");
        int yuan = input.nextInt(); // сумма денег в китайских юанях

        double roubles = Math.ceil(ROUBLES_PER_YUAN * yuan); // сумма денег в российских рублях

        System.out.println(yuan + " китайских юаней составляют " + roubles + " российских рублей.");
    }
}