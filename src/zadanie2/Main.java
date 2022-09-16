package zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj cenę hurtową produktu: ");
        double cenaHurtowa = keyboard.nextDouble();
        System.out.print("Podaj marżę na produkt(%): ");
        double procentMarzy = keyboard.nextDouble();

        detailPrice(cenaHurtowa, procentMarzy);
    }

    public static void detailPrice(double cenaHurtowa, double procentMarzy) {
        double marza = 1 + procentMarzy/100;
        double cenaDetaliczna = cenaHurtowa * marza;

        System.out.println("Cena detaliczna tego produktu wynosi " + cenaDetaliczna + " złotych.");
    }

}
