import java.util.Scanner;

public class Arithmetic {
    private int num1;
    private int num2;

    public Arithmetic(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }


    public int calculateSum() {
        return num1 + num2;
    }


    public int calculateMultiplication() {
        return num1 * num2;
    }


    public int findMaximum() {
        if(num1 > num2) return num1;
        if(num2 > num1) return num2;
        else return num1;
    }

    public int findMinimum() {
        if(num1 < num2) return num1;
        if(num2 < num1) return num2;
        else return num1;
    }

    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Введите второе число: ");
        int b = new Scanner(System.in).nextInt();

        Arithmetic arithmetic = new Arithmetic(a, b);

        System.out.println("Сумма чисел: " + arithmetic.calculateSum());
        System.out.println("Произведение чисел: " + arithmetic.calculateMultiplication());
        System.out.println("Максимальное число: " + arithmetic.findMaximum());
        System.out.println("Минимальное число: " + arithmetic.findMinimum());
    }
}
