public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit = 1_000_000;


    public Basket(String items, int totalPrice) {
        this();
        add(items, totalPrice);
    }

    public Basket(int limit) {
        this();
        this.limit = limit; // переменная после точки будет относиться к классу
    }

    public Basket() {
        items += "Список товаров:";
    }

    public void add(String name, int price) {
        if (totalPrice + price > limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
        }
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость данной корзины равна: " + getTotalPrice());
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean containsItem(String name) {
        return items.contains(name);
    }
    // items типизирован стрингом
    // конкретный кекс - обьект
    // формочка - класс
}
