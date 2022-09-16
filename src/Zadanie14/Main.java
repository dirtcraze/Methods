package Zadanie14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 1, even = 0, odd = 0;
        while (counter<=100) {
            if (isEven(random)) even +=1;
            else odd +=1;
            counter++;
        }
        System.out.println(even + ":" + odd);
    }

    public static boolean isEven(Random number) {
        int result = number.nextInt();
        if ((result % 2) == 0) return true;

        return false;
    }
}
