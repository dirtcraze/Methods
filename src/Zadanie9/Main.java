package Zadanie9;

public class Main {
    public static void main(String[] args) {
        double LA = 100, CZ = 10, PZ = 0.01, CS = 16, PS = 0.01;
        stockResult(LA, CZ, PZ, CS, PS);
    }

    public static void stockResult(double LA, double CZ, double PZ, double CS, double PS) {
        double result = ((LA * CS) - (LA * CS * PS)) - ((LA * CZ) - (LA * CZ * PZ));
        String sum =  result > 0 ? "Zarobiłeś na akcjach: " + result : "Straciłeś na akcjach: " + Math.abs(result);
        System.out.println(sum);
    }
}
