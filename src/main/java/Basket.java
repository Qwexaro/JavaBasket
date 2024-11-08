public class Basket {
    private static String items = "";
    private static int totalPrice = 0;

    public static void main(String[] args) {
        add("1 кг индейки", 700);
        add("Гранатовый сок", 300);
        add("Консервированный помидор", 250);
        add("1 кг индейки", 700);
        add("Пакет молока", 100);
        add("Твикс", 65);
        add("1 кг индейки", 700);
        print("Содержимое корзины:");
        clear();
        print("Содержимое корзины:");
    }

    public static void add(String name, int price) {
        if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
        }
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static void print(String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость данной корзины равна: " + getTotalPrice());
        }
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static boolean containsItem(String name) {
        return items.contains(name);
    }
    // items типизирован стрингом
}
