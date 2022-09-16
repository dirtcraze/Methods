package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double powierzchnia, sumaPowierzchni = 0, cenaFarby;

        Scanner keybaord = new Scanner(System.in);
        System.out.print("Liczba pokoi do wymalowania: ");
        int liczbaPokoi = keybaord.nextInt();
        for (int i=1; i<=liczbaPokoi; i++) {
            System.out.print("Powierzchnia pokoju nr " + i + ": ");
            powierzchnia = keybaord.nextDouble();
            sumaPowierzchni += powierzchnia;
        }
        System.out.print("Podaj cenę farby za litr: ");
        cenaFarby = keybaord.nextDouble();

        double iloscLitrow = potrzebnaFarba(sumaPowierzchni),
        liczbaGodzinPracy = liczbaGodzinPracy(sumaPowierzchni),
        kosztFarby = kosztFarby(cenaFarby, iloscLitrow),
        kosztRobocizny = kosztRobocizny(liczbaGodzinPracy),
        lacznyKosztMalowania = kosztFarby + kosztRobocizny;

        System.out.println("Liczba potrzebnych litrów farby: " + iloscLitrow);
        System.out.println("Liczba potrzebnych godzin pracy: " + liczbaGodzinPracy);
        System.out.println("Koszt farby: " + kosztFarby);
        System.out.println("Koszt robocizny: " + kosztRobocizny);
        System.out.println("Łączny koszt malowania: " + lacznyKosztMalowania);
    }

    public static double potrzebnaFarba(double sumaPowierzchni) {
        final double IloscFarbyNaMetr = 0.15;
        double iloscLitrow = IloscFarbyNaMetr * sumaPowierzchni;
        return iloscLitrow;
    }

    public static double liczbaGodzinPracy(double sumaPowierzchni) {
        final double iloscGodzinNaMetr = 0.8;
        double iloscGodzinNaPomalowanie = iloscGodzinNaMetr * sumaPowierzchni;
        return iloscGodzinNaPomalowanie;
    }

    public static double kosztFarby(double cenaFarby, double iloscLitrow) {
        return cenaFarby * iloscLitrow;
    }

    public static double kosztRobocizny(double liczbaGodzinPracy) {
        final double cenaZaGodzine = 18;
        return cenaZaGodzine * liczbaGodzinPracy;
    }
}
