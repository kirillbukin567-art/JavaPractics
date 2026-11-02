import java.util.ArrayList;

// Проверка Задания 1: удаление дубликатов, поиск, наибольший элемент
public class TestGenerics {
    public static void main(String[] args) {
        // --- 1. removeDuplicates ---
        System.out.println("=== 1. Удаление дубликатов ===");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34); numbers.add(12); numbers.add(34);
        numbers.add(56); numbers.add(12); numbers.add(78);
        System.out.println("Было:  " + numbers);
        System.out.println("Стало: " + GenericMethods.removeDuplicates(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("java"); words.add("c++"); words.add("java"); words.add("python"); words.add("c++");
        System.out.println("Было:  " + words);
        System.out.println("Стало: " + GenericMethods.removeDuplicates(words));

        // --- 2. linearSearch ---
        System.out.println();
        System.out.println("=== 2. Линейный поиск ===");
        Integer[] nums = {3, 8, 1, 9, 5};
        System.out.println("Число 9 в массиве {3, 8, 1, 9, 5}: позиция " + GenericMethods.linearSearch(nums, 9));
        System.out.println("Число 7 в массиве {3, 8, 1, 9, 5}: позиция " + GenericMethods.linearSearch(nums, 7));
        String[] names = {"Анна", "Борис", "Вера"};
        System.out.println("Строка \"Вера\" в массиве строк: позиция " + GenericMethods.linearSearch(names, "Вера"));

        // --- 3. max для одномерного массива ---
        System.out.println();
        System.out.println("=== 3. Наибольший элемент массива ===");
        Circle[] circles = {new Circle(2), new Circle(7.5), new Circle(4)};
        System.out.println("Наибольший круг: " + GenericMethods.max(circles));
        System.out.println("Наибольшее число: " + GenericMethods.max(nums));
        String[] cities = {"Москва", "Тверь", "Казань"};
        System.out.println("Наибольшая строка (по алфавиту): " + GenericMethods.max(cities));

        // --- 4. max для двумерного массива ---
        System.out.println();
        System.out.println("=== 4. Наибольший элемент двумерного массива ===");
        Integer[][] table = {
                {1, 5, 3},
                {9, 2, 4},
                {7, 8, 6}
        };
        System.out.println("Наибольшее число в таблице: " + GenericMethods.max(table));
        Circle[][] circleTable = {
                {new Circle(1), new Circle(3)},
                {new Circle(10), new Circle(5)}
        };
        System.out.println("Наибольший круг в таблице: " + GenericMethods.max(circleTable));
    }
}
/*
javac -encoding UTF-8 *.java
java TestGenerics
 */