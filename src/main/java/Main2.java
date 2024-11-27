public class Main2 {
    public static void main(String[] args) {
//        Basket sergBasket = new Basket();
//        sergBasket.add("Индейки", 700, 3, 12.5);
//        sergBasket.add("Гранатовый сок", 300, 2, 13);
//        sergBasket.add("Консервированный помидор", 250, 12);
//        sergBasket.add("Индейки", 700, 1);
//        sergBasket.add("Пакет молока", 100, 12.4);
//        sergBasket.add("Твикс", 65, 2);
//        sergBasket.add("Индейки", 700, 1);
//        sergBasket.print("Содержимое корзины:");
//        sergBasket.clear();
//        sergBasket.print("Содержимое корзины:");
//
//        System.out.println();
//
//        Basket petyaBasket = new Basket(5000);
//        petyaBasket.add("Миксер", 2150, 100);
//        petyaBasket.add("Клавиатура", 3500, 100);
//        petyaBasket.print("Содержимое корзины: ");
//
//        System.out.println();
//
//        Basket mashaBasket = new Basket("Стол", 10_000, 20);
//        mashaBasket.print("Содержимое корзины:");
//
//        System.out.println("\nК-во корзин: " + Basket.getCountBasket());


        Basket mikeBasket = new Basket();

        Product firstProduct = new Product("Колбаса", 600, 2.5);
        mikeBasket.add(firstProduct);
        System.out.println(firstProduct);
//        mikeBasket.add("колбаса", 600, 40);
        System.out.println(mikeBasket.getTotalPrice());
    }


}

    /*
    Класс представляет из себя шаблон, описывающий состояние и поведение объектов
    */

