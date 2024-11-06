public class Basket {
    private static String items = "";

    public static void main(String[] args) {
        add("1 кг индейки", 700);
        add("Гранатовый сок", 300);
        add("Консервированный помидор", 250);
        add("Пакет молока", 100);
        add("Твикс", 65);
        print("Содержимое корзины:");
        clear();
        print("Содержимое корзины:");
    }

    public static void add(String name, int price) {
        if (items.isEmpty()) {
            items += name + " - " + price;
        } else {
            items += "\n" + name + " - " + price;
        }
    }

    public static void clear() {
        items = "";
    }

    public static void print(String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}
