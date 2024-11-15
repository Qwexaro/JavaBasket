public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit = 1_000_000;
    private static int countBasket = 0;
    private double totalWeight = 0;

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        add(items, totalPrice, totalWeight);
    }

    public Basket(int limit) {
        this();
        this.limit = limit; // переменная после точки будет относиться к классу
    }


    public Basket() {
        countBasket++;
        items += "Список товаров:";
    }

    public void add(String name, int price, int count, double weight) {

        price *= count;
        if (totalPrice + price > limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price + " Вес: " + weight + "kg";
            totalPrice += price;
            totalWeight += weight;

        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
            totalWeight += weight;
        }
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public void print(String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость данной корзины равна: " + getTotalPrice());
            System.out.println("Вес корзины: " + getTotalWeight());
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean containsItem(String name) {
        return items.contains(name);
    }

    public static int getCountBasket() {
        return countBasket;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    // items типизирован стрингом
    // конкретный кекс - обьект
    // формочка - класс
}
