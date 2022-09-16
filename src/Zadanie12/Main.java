package Zadanie12;

public class Main {
    public static void main(String[] args) {
        isPrime(12);
    }

    public static void isPrime(int primeNumber) {
        int divider = 0;

        for (int i = primeNumber;i>0;i--) {
            if (primeNumber%i == 0) divider += 1;
        }
        if (divider == 2) System.out.print(primeNumber + " to jest liczba pierwsza." );
        else System.out.print(primeNumber + " to nie jest liczba pierwsza." );
    }
}
