import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distance = new Scanner(System.in).nextDouble();
        double speed = new Scanner(System.in).nextDouble();

        double time_hours = distance / speed;

        int hours = (int) time_hours;
        int minutes = (int) ((time_hours - hours) * 60);


        System.out.println("Время в пути: " + hours + " часов и " + minutes + " минут");

    }
}
