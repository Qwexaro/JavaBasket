public class Basket {
    private static double totalCost = 0;
    private static int totalCount = 0;
    private static int countBasket = 0;

    private Product product;
    private String items = "";
    private int totalPrice = 0;
    private int limit = 1_000_000;
    private double totalWeight = 0;

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        add(product);
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket() {
        countBasket++;
        items += "Список товаров:";
    }

    public void add(Product product, int count) {
        String name = product.getName();
        int price = product.getSalary() * count;

        if (totalPrice + price > limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
            totalCost += price;
            totalCount += count;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
            totalCost += price;
            totalCount += count;
        }
    }

    public void add(Product product) {
        add(product, 1);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public void print(String title) {
        System.out.println(title);
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

    public static double getCalculateAveragePrice() {
        if (totalCount == 0) {
            return 0;
        }
        return totalCost / totalCount;
    }

    public static double getTotalPriceAll() {
        if (countBasket == 0) {
            return 0;
        }
        return totalCost / countBasket;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}
