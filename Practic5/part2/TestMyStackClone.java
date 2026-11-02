// Задание 2.2: проверка клонирования. Сравниваем поверхностную и глубокую копию
public class TestMyStackClone {
    public static void main(String[] args) {
        MyStack original = new MyStack();
        original.push("A");
        original.push("B");
        original.push("C");
        System.out.println("Оригинал:            " + original);

        // --- Поверхностная копия: список общий для обоих стеков ---
        MyStack shallow = original.shallowCopy();
        original.push("D");
        System.out.println();
        System.out.println("=== Поверхностная копия ===");
        System.out.println("Добавили D в оригинал");
        System.out.println("Оригинал:            " + original);
        System.out.println("Поверхностная копия: " + shallow + "   <- тоже изменилась!");

        // --- Глубокая копия: у копии свой список ---
        MyStack deep = (MyStack) original.clone();
        original.push("E");
        deep.pop();
        System.out.println();
        System.out.println("=== Глубокая копия (clone) ===");
        System.out.println("Добавили E в оригинал, достали элемент из копии");
        System.out.println("Оригинал:            " + original);
        System.out.println("Глубокая копия:      " + deep + "   <- живёт сама по себе");
    }
}
/*
javac -encoding UTF-8 *.java
java TestMyStackClone
java TestMyStack
 */