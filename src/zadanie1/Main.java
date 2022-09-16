package zadanie1;

public class Main {
    public static void main(String[] args) {
        String cityName = "Warszawa";
        showCar(cityName, 1);
    }

    public static void showCar(String cityName, int pozycja) {
        System.out.println(cityName.charAt(pozycja));
    }

}
