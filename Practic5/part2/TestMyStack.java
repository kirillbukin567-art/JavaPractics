import java.util.Scanner;

// Задание 2.1: клиент MyStack — запрашивает пять строк и выводит их в обратном порядке
public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();                    // композиция
        MyStackInherited inherited = new MyStackInherited();   // наследование

        System.out.println("Введите пять строк (после каждой нажмите Enter):");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Строка " + i + ": ");
            String line = input.nextLine();
            stack.push(line);
            inherited.push(line);
        }

        System.out.println();
        System.out.println(stack);
        System.out.println("В обратном порядке (MyStack, композиция):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("В обратном порядке (MyStackInherited, наследование):");
        while (!inherited.isEmpty()) {
            System.out.println(inherited.pop());
        }
    }
}