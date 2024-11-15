public class Main2 {
    public static void main(String[] args) {
        Basket sergBasket = new Basket();
        sergBasket.add("1 кг индейки", 700, 3);
        sergBasket.add("Гранатовый сок", 300, 2);
        sergBasket.add("Консервированный помидор", 250);
        sergBasket.add("1 кг индейки", 700);
        sergBasket.add("Пакет молока", 100);
        sergBasket.add("Твикс", 65, 10);
        sergBasket.add("1 кг индейки", 700, 2);
        sergBasket.print("Содержимое корзины:");
        sergBasket.clear();
        sergBasket.print("Содержимое корзины:");

        System.out.println();

        Basket petyaBasket = new Basket(5000);
        petyaBasket.add("Миксер", 2150);
        petyaBasket.add("Клавиатура", 3500);
        petyaBasket.print("Содержимое корзины: ");

        System.out.println();

        Basket mashaBasket = new Basket("Стол", 10_000);
        mashaBasket.print("Содержимое корзины:");

        System.out.println("\nК-во корзин: " + Basket.getCountBasket());
    }
}
    /*
    Класс представляет из себя шаблон, описывающий состояние и поведение объектов
    */

