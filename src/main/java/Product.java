public class Product {
    private String name;
    private int salary;
    private double weight;

    public Product(String name, int salary, double weight) {
        this.name = name;
        this.salary = salary;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double getWeight() {
        return weight;
    }

    public Product setName(String name) {
        return new Product(name, salary, weight);
    }

    public Product setSalary(int salary) {
        return new Product(name, salary, weight);
    }

    public Product setWeight(double weight) {
        return new Product(name, salary, weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' + ", salary=" + salary +
                ", weight=" + weight + '}';
    }
}