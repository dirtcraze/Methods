package Zadanie15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wartość przyszła, jaką chcesz uzyskać na koncie: ");
        double futureValue = keyboard.nextDouble();
        System.out.println("Roczna stopa oprocentowania(%): ");
        double annualRate = keyboard.nextDouble();
        System.out.println("Liczba lat, przez jakie planujesz pozostawić pieniądze na koncie: ");
        double numberOfYears = keyboard.nextDouble();

        presentValue(futureValue, annualRate, numberOfYears);
    }

    public static void presentValue(double futureValue, double annualRate, double numberOfYears) {
        double currentValue = futureValue / Math.pow((1+(annualRate/100)), numberOfYears);
        System.out.println("Musisz zdeponować: " + currentValue);
    }
}
