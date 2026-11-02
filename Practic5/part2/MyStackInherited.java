import java.util.ArrayList;
import java.util.EmptyStackException;

// Тот же стек, но через НАСЛЕДОВАНИЕ от ArrayList (is-a) — для сравнения с композицией
public class MyStackInherited extends ArrayList<Object> {

    public int getSize() {
        return size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return get(size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return remove(size() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}