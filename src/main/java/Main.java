import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введи расстояние:");
        double distance = new Scanner(System.in).nextDouble();
        System.out.println("Введи скорость:");
        double speed = new Scanner(System.in).nextDouble();

        double time_hours = distance / speed;

        int hours = (int) time_hours;
        int minutes = (int) ((time_hours - hours) * 60);


        System.out.println("Время в пути: " + hours + " час и " + minutes + " минут");

    }
}
