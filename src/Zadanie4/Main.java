package Zadanie4;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            fallingDistance(i);
    }

    public static void fallingDistance(int fallingTime) {
        final double gravitation = 9.8;
        double distance = 0.5 * gravitation * Math.pow(fallingTime, 2);
        System.out.println("Odleglość przy spadaniu przez " + fallingTime + "s: " + distance);
    }
}
