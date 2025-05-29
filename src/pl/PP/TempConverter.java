package pl.PP; // Upewnij się, że nazwa pakietu jest poprawna dla Twojego projektu

import java.util.Scanner; // Importujemy klasę Scanner do wczytywania danych z klawiatury

public class TempConverter { // Nazwa klasy

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program do konwersji temperatury z Fahrenheita.");
        System.out.println("Wprowadź -1, aby wyjść z programu.");


        while (true) {
            System.out.print("Podaj temperaturę w Fahrenheitach: ");


            if (!scanner.hasNextDouble()) {
                String input = scanner.next();
                if (input.equals("-1")) {
                    System.out.println("Zamykanie programu.");
                    break;
                } else {
                    System.out.println("Niepoprawne wprowadzenie. Proszę podaj liczbę lub -1.");
                    continue;
                }
            }

            double fahrenheit = scanner.nextDouble();


            if (fahrenheit == -1.0) {
                System.out.println("Zamykanie programu.");
                break;
            }


            double celsius = (fahrenheit - 32) / 1.8;


            double kelvin = celsius + 273.16;


            System.out.printf("%.2f Fahrenheita = %.2f Celsjusza i %.2f Kelwina%n",
                    fahrenheit, celsius, kelvin);
        }

        scanner.close();
    }
}