package Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choosenOption = 0;

        Scanner keybaord = new Scanner(System.in);
        System.out.print("Podaj odległość w metrach: ");
        double meterDistance = keybaord.nextDouble();
        do {
            System.out.println("1. Przelicz na kilometry.");
            System.out.println("2. Przelicz na cale.");
            System.out.println("3. Przelicz na stopy.");
            System.out.println("4. Zamknij program.");
            System.out.print("Podaj wybraną opcję: ");
            choosenOption = keybaord.nextInt();
            switch (choosenOption) {
                case 1:
                    showKilometers(meterDistance);
                    break;
                case 2:
                    showInches(meterDistance);
                    break;
                case 3:
                    showFeet(meterDistance);
                    break;
                case 4:
                    System.out.println("Żegnaj!");
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcję. Spróbuj ponownie!");
            }
        }
        while (choosenOption != 4);
    }

    public static void showKilometers(double meter) {
        double result = meter * 0.001;
        System.out.println(meter + " metrów w kilometrach to " + result);
    }

    public static void showInches(double meter) {
        double result = meter * 39.37;
        System.out.println(meter + " metrów w calach to " + result);
    }

    public static void showFeet(double meter) {
        double result = meter * 3.281;
        System.out.println(meter + " metrów w stopach to " + result);
    }
}
