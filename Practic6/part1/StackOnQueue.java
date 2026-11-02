import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

// Стек (LIFO), построенный на двух очередях (FIFO). Композиция: очереди лежат внутри класса.
// Используем только методы очереди: offer, peek, poll, size, isEmpty
public class StackOnQueue {
    private Queue<Integer> main = new LinkedList<>();     // здесь элементы в порядке стека: впереди — вершина
    private Queue<Integer> helper = new LinkedList<>();   // вспомогательная очередь

    // Положить x на вершину стека
    public void push(int x) {
        helper.offer(x);                 // 1) новый элемент становится первым во вспомогательной очереди
        while (!main.isEmpty()) {        // 2) за ним переносим все старые элементы
            helper.offer(main.poll());
        }
        swap();                          // 3) меняем очереди ролями: теперь вершина снова впереди
    }

    // Убрать верхний элемент и вернуть его
    public int pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return main.poll();
    }

    // Посмотреть верхний элемент, не убирая его
    public int top() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return main.peek();
    }

    // Стек пуст?
    public boolean empty() {
        return main.isEmpty();
    }

    // Строка со всеми элементами: слева направо от дна к вершине, вершина — справа
    @Override
    public String toString() {
        String result = "";
        int n = main.size();
        for (int i = 0; i < n; i++) {
            int x = main.poll();         // достаём элемент (начиная с вершины)...
            helper.offer(x);             // ...и кладём во вспомогательную очередь, чтобы ничего не потерять
            result = (i == 0) ? String.valueOf(x) : x + ", " + result;   // каждый следующий пишем левее
        }
        swap();
        return "стек: [" + result + "]";
    }

    // Меняем очереди местами: main и helper обмениваются ссылками
    private void swap() {
        Queue<Integer> tmp = main;
        main = helper;
        helper = tmp;
    }
}