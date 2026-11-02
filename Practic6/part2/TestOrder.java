// Демонстрация паттерна Builder: заказы с разными конфигурациями
public class TestOrder {
    public static void main(String[] args) {
        // 1. Полный заказ: все четыре части
        Order full = new OrderBuilder()
                .setMainDish("Стейк")
                .setSideDish("Картофель фри")
                .setDrink("Морс")
                .setDessert("Чизкейк")
                .build();
        System.out.println("1. " + full);

        // 2. Быстрый заказ: только блюдо и напиток
        Order quick = new OrderBuilder()
                .setMainDish("Паста карбонара")
                .setDrink("Чай")
                .build();
        System.out.println("2. " + quick);

        // 3. Заказ без напитка, но с гарниром и десертом
        Order noDrink = new OrderBuilder()
                .setMainDish("Котлета")
                .setSideDish("Гречка")
                .setDessert("Мороженое")
                .build();
        System.out.println("3. " + noDrink);

        // 4. Пошаговая сборка: строитель не обязан вызываться одной цепочкой
        OrderBuilder builder = new OrderBuilder();
        builder.setMainDish("Суп дня");
        builder.setDrink("Компот");
        Order step = builder.build();
        System.out.println("4. " + step);

        // 5. Ошибка: основное блюдо не выбрано
        try {
            Order bad = new OrderBuilder().setDrink("Кола").build();
            System.out.println("5. " + bad);
        } catch (IllegalStateException e) {
            System.out.println("5. Ошибка: " + e.getMessage());
        }
    }
}
/*
javac -encoding UTF-8 *.java
java TestOrder
 */