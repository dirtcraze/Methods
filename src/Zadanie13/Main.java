package Zadanie13;

public class Main {
    public static void main(String[] args) {
        int loopNumber = 1;
        while (loopNumber <= 10000){
            isPrime(loopNumber);
            loopNumber++;
        }
    }

    public static void isPrime(int primeNumber) {
        int divider = 0;

        for (int i = primeNumber;i>0;i--) {
            if (primeNumber%i == 0) {
                divider += 1;
            }
        }
        if (divider == 2) System.out.println(primeNumber + " to jest liczba pierwsza." );
    }
}
