package Zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] results = new double[5];

        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Podaj wynik z testu nr " + i + ": ");
            results[i - 1] = keyboard.nextDouble();
        }

        calcAverage(results);
        determineGrade(results);
    }

    public static void calcAverage(double[] results) {
        double resultSum = 0;
        for (int i = 0; i < results.length; i++) {
            resultSum += results[i];
        }

        double avgResult = resultSum / results.length;
        System.out.println("Średni wynik testów: " + avgResult);
    }

    public static void determineGrade(double[] results) {
        int grade = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i]>=90) grade = 5;
            else if (results[i]>=80) grade = 4;
            else if (results[i]>=70) grade = 3;
            else if (results[i]>=60) grade = 2;
            else grade = 1;
            System.out.println(results[i] + "% - " + grade);
        }
    }
}