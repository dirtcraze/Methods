package Zadanie5;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            celcius(i);
    }

    public static void celcius(double fahrenheit) {
        double celcius =(double)5/9*(fahrenheit-32);
        System.out.println(fahrenheit + "F -> " + celcius + "C");
    }
}
