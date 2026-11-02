import java.util.ArrayList;
import java.util.EmptyStackException;

// Стек через НАСЛЕДОВАНИЕ от ArrayList (Задание 2.2): "стек является списком" (is-a)
public class GenericStackInherited<E> extends ArrayList<E> {

    public int getSize() {
        return size();               // size() уже есть в ArrayList
    }

    public E peek() {
        if (isEmpty()) {             // isEmpty() тоже унаследован
            throw new EmptyStackException();
        }
        return get(size() - 1);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return remove(size() - 1);   // remove(индекс) удаляет и возвращает элемент
    }

    public void push(E o) {
        add(o);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}