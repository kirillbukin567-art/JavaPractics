import java.util.ArrayList;
import java.util.EmptyStackException;

// Стек через КОМПОЗИЦИЮ: внутри лежит объект ArrayList (отношение "имеет" — has-a).
// Cloneable — разрешение копировать объекты этого класса методом clone()
public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();   // список для хранения элементов

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    // ГЛУБОКАЯ копия поля списка (Задание 2.2)
    @Override
    public Object clone() {
        try {
            MyStack copy = (MyStack) super.clone();   // 1) поверхностная копия: copy.list указывает на ТОТ ЖЕ список
            copy.list = new ArrayList<>(list);        // 2) глубокая: даём копии свой, новый список
            return copy;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    // Только для демонстрации разницы: копия БЕЗ копирования списка (поверхностная)
    public MyStack shallowCopy() {
        try {
            return (MyStack) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}