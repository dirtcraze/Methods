package Zadanie8;

public class Main {
    public static void main(String[] args) {
        double speed = 60, time = 0.5;
        distance(speed, time);
    }

    public static void distance(double speed, double time) {
        double distance = speed * time;
        System.out.println(distance);
    }
}
