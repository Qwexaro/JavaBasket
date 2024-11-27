public class Product {
    private final String name;
    private final int salary;
    private final double weight;

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", weight=" + weight +
                '}';
    }
}
// pojo class tot kotori mozhno cherez alt+ins sdelat
