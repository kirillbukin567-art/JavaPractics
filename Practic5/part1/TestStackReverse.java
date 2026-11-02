import java.util.Scanner;

// Задание 2.2: запрашиваем пять строк и выводим их в обратном порядке
public class TestStackReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GenericStackInherited<String> stack = new GenericStackInherited<>();   // через наследование
        GenericStack<String> arrayStack = new GenericStack<>();                // через массив

        System.out.println("Введите пять строк (после каждой нажмите Enter):");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Строка " + i + ": ");
            String line = input.nextLine();
            stack.push(line);
            arrayStack.push(line);
        }

        System.out.println();
        System.out.println(stack);
        System.out.println("В обратном порядке (стек-наследник):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("В обратном порядке (стек на массиве):");
        while (!arrayStack.isEmpty()) {
            System.out.println(arrayStack.pop());
        }
    }
}
/*
javac TestStackReverse.java
java TestStackReverse
 */