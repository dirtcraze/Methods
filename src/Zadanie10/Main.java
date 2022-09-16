package Zadanie10;

public class Main {
    public static void main(String[] args) {
        Companies firmaA = new Companies("firmaA",100, 10, 0.01, 16, 0.01);
        Companies firmaB = new Companies("firmaB",420, 17, 0.02, 22, 0.03);
        stockResult(firmaA.name, firmaA.LA, firmaA.CZ, firmaA.PZ, firmaA.CS, firmaA.PS);
        stockResult(firmaB.name, firmaB.LA, firmaB.CZ, firmaB.PZ, firmaB.CS, firmaB.PS);
    }

    public static void stockResult(String name, double LA, double CZ, double PZ, double CS, double PS) {
        double result = ((LA * CS) - (LA * CS * PS)) - ((LA * CZ) - (LA * CZ * PZ));
        String sum =  result > 0 ? name + " zarobiła na akcjach: " + result : name + " straciła na akcjach: " + Math.abs(result);
        System.out.println(sum);
    }
}
