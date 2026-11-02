// Задача 2: проверка стека, построенного на очередях
public class TestStackOnQueue {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        // Добавляем два значения
        stack.push(10);
        stack.push(20);
        System.out.println("После push(10) и push(20): " + stack);

        // Верхний элемент без удаления
        System.out.println("top(): " + stack.top());
        System.out.println("После top(): " + stack);

        // Верхний элемент с удалением
        System.out.println("pop(): " + stack.pop());

        // Проверка на пустоту
        System.out.println("Стек пуст? " + stack.empty());

        // Информация о всех элементах
        System.out.println("Оставшиеся элементы: " + stack);

        // Дополнительно: убираем последний элемент и снова проверяем на пустоту
        System.out.println("pop(): " + stack.pop());
        System.out.println("Стек пуст? " + stack.empty());
        System.out.println(stack);
    }
}
/*
javac -encoding UTF-8 *.java
java TestStackOnQueue
 */