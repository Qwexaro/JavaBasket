public class Order {
    public void addProductWithDiscount(Product product) {
        if (product.getSalary() >= 1_000) {
            int percent = product.getSalary() * 10 / 100;
            int priceProduct = product.getSalary() - percent;
            Product currentProduct = product.setSalary(priceProduct);
            System.out.println("Стоимость продукта: " + currentProduct.getSalary());
        }
    }

    public void addProduct(Product product) {
        System.out.println("Стоимость продукта: " + product.getSalary());
    }
}
