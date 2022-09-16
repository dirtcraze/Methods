package Zadanie11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj masę ciała(kg): ");
        double weight = keyboard.nextDouble();
        System.out.print("Podaj prędkość ciała(m/s): ");
        double speed = keyboard.nextDouble();

        kineticEnergy(weight, speed);
    }

    public static void kineticEnergy(double weight, double speed) {
        double kineticEnergy = 0.5 * weight * Math.pow(speed, 2);
        System.out.println("Energia kinetyczna obiektu wynosi: " + kineticEnergy);
    }
}
