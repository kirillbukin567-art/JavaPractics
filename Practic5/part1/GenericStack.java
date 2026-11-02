import java.util.EmptyStackException;

// Стек на массиве (Задание 2.1). Когда массив заполнен — создаётся новый, вдвое больше
public class GenericStack<E> {
    private E[] elements;   // сами элементы стека
    private int size = 0;   // сколько элементов лежит в стеке сейчас

    // Начальный размер массива сделан маленьким (2), чтобы рост было видно на тесте
    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[2];
    }

    public int getSize() {
        return size;
    }

    // Текущий размер массива (нужен только для демонстрации роста)
    public int getCapacity() {
        return elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Показать верхний элемент, не удаляя его
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    // Достать верхний элемент и удалить его из стека
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E top = elements[size - 1];
        elements[size - 1] = null;   // убираем ссылку, чтобы она не висела в массиве
        size--;
        return top;
    }

    // Положить элемент на вершину
    @SuppressWarnings("unchecked")
    public void push(E o) {
        // Если массив заполнен — делаем новый вдвое больше и копируем в него элементы
        if (size == elements.length) {
            E[] bigger = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                bigger[i] = elements[i];
            }
            elements = bigger;
        }
        elements[size] = o;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}