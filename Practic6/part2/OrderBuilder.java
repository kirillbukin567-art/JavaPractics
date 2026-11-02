// Строитель заказа: собирает Order по шагам.
// Каждый set-метод возвращает сам строитель (return this), поэтому вызовы можно писать цепочкой
public class OrderBuilder {
    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;

    public OrderBuilder setMainDish(String mainDish) {
        this.mainDish = mainDish;
        return this;
    }

    public OrderBuilder setSideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public OrderBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public OrderBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    // Возвращает готовый заказ. Основное блюдо обязательно: без него заказ не собрать
    public Order build() {
        if (mainDish == null) {
            throw new IllegalStateException("Нельзя создать заказ без основного блюда");
        }
        return new Order(mainDish, sideDish, drink, dessert);
    }
}