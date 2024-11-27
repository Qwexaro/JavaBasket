public class Order {
    public void addProductWithDiscount(Product product) {
        if (product.getSalary() >= 1_000) {
            int percent = product.getSalary() * 10 / 100;
            int priceProduct = product.getSalary() - percent;
            System.out.println("Стоимость продукта: " + priceProduct);
        }
    }

    public void addProduct(Product product) {
        System.out.println("Стоимость продукта: " + product.getSalary());
    }
}
