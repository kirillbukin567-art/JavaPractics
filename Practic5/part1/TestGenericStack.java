import java.util.EmptyStackException;

// Проверка стека на массиве (Задание 2.1)
public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        System.out.println("Пустой стек? " + stack.isEmpty() + ", размер массива: " + stack.getCapacity());

        // Кладём числа 1..6 и смотрим, как растёт массив
        for (int i = 1; i <= 6; i++) {
            stack.push(i);
            System.out.println("push(" + i + "): элементов " + stack.getSize()
                    + ", размер массива " + stack.getCapacity());
        }
        System.out.println(stack);
        System.out.println("Вершина (peek): " + stack.peek() + ", элементов осталось " + stack.getSize());

        // Достаём всё подряд — порядок обратный
        System.out.print("Достаём (pop):");
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println();
        System.out.println("Пустой стек? " + stack.isEmpty());

        // Стек строк
        GenericStack<String> words = new GenericStack<>();
        words.push("один");
        words.push("два");
        words.push("три");
        System.out.println(words);

        // pop из пустого стека — ошибка, которую можно перехватить
        GenericStack<String> empty = new GenericStack<>();
        try {
            empty.pop();
        } catch (EmptyStackException e) {
            System.out.println("Нельзя достать элемент из пустого стека");
        }
    }
}
/*
javac -encoding UTF-8 *.java
java TestGenericStack
 */