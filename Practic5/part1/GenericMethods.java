import java.util.ArrayList;

// Набор обобщённых (generic) методов. Буква E — "любой тип", его подставит компилятор
public class GenericMethods {

    // Задание 1.1. Возвращает НОВЫЙ список без дубликатов
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            // добавляем элемент, только если такого в результате ещё нет
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    // Задание 1.2. Линейный поиск: возвращает позицию элемента или -1, если его нет
    public static <E> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Задание 1.3. Наибольший элемент массива.
    // E extends Comparable<E> — E обязан уметь сравниваться (иметь compareTo)
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];                      // считаем первый элемент наибольшим
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) { // если текущий больше — запоминаем его
                max = list[i];
            }
        }
        return max;
    }

    // Задание 1.4. Наибольший элемент двумерного массива
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}