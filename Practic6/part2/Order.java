// Заказ в ресторане. Объекты этого класса создаёт OrderBuilder
public class Order {
    private final String mainDish;   // основное блюдо
    private final String sideDish;   // гарнир
    private final String drink;      // напиток
    private final String dessert;    // десерт

    // Конструктор доступен только внутри пакета — заказы создаются через OrderBuilder
    Order(String mainDish, String sideDish, String drink, String dessert) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    // Если часть заказа не выбрана (null), пишем "нет"
    private static String show(String value) {
        return value == null ? "нет" : value;
    }

    @Override
    public String toString() {
        return "Заказ: основное блюдо = " + show(mainDish)
                + ", гарнир = " + show(sideDish)
                + ", напиток = " + show(drink)
                + ", десерт = " + show(dessert);
    }
}