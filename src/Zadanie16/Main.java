package Zadanie16;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int computerTurn = 0, userTurn = 0;
        final String[] choose = {"Kamień", "Papier", "Nożyce"};

        do {
            computerTurn = computerTurn();
            System.out.println("Komputer dokonał wyboru. Teraz twoja kolej!");
            userTurn = userTurn();
            System.out.println("\nKomputer wybrał: " + choose[computerTurn]);
            System.out.println("Użytkownik wybrał: " + choose[userTurn-1] + "\n");

            endingInfo(computerTurn, userTurn-1);
        }
        while (computerTurn==userTurn-1);
    }
    public static int computerTurn() {
        Random random = new Random();
        int asd = random.nextInt(3);
        return asd;
    }

    public static int userTurn() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wybierz:\n1. Kamień\n2. Papier\n3. Nożyce");
        System.out.print("Twój wybór: ");
        int userTurn = keyboard.nextInt();
        return userTurn;
    }

    public static void endingInfo(int computerTurn, int userTurn) {
        if (computerTurn == userTurn) System.out.println("Remis! Trzeba powtórzyć grę.\n");
        else if (computerTurn > userTurn) System.out.println("Wygrywa komputer!");
        else if (computerTurn == 0 && userTurn == 2) System.out.println("Wygrywa komputer!");
        else System.out.println("Wygrywa użytkownik!");
    }
}
