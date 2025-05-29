package pl.PP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true; // Flaga do sterowania pętlą główną


        while (continueCalculating) {

            System.out.println("Prosty Kalkulator");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");


            int choice = 0;
            boolean validChoice = false;


            while (!validChoice) {
                System.out.print("Wybierz operację (1-4): ");
                String input = scanner.nextLine();

                try {
                    choice = Integer.parseInt(input);


                    if (choice >= 1 && choice <= 4) {
                        validChoice = true;
                    } else {
                        System.out.println("Nieprawidłowy wybór. Wprowadź liczbę od 1 do 4."); // Komunikat błędu
                    }
                } catch (NumberFormatException e) {

                    System.out.println("Nieprawidłowy format danych. Wprowadź liczbę odpowiadającą opcji menu."); // Komunikat błędu
                }
            }




            double num1 = 0;
            double num2 = 0;
            boolean validNumbers = false;


            while(!validNumbers) {
                try {
                    System.out.print("Podaj pierwszą liczbę: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    num2 = scanner.nextDouble();
                    validNumbers = true;
                } catch (InputMismatchException e) {
                    System.out.println("Nieprawidłowy format danych. Proszę wprowadzić dane liczbowe.");
                    scanner.next();
                }
            }

            double result = 0;


            switch (choice) {
                case 1: // Dodawanie
                    result = num1 + num2;
                    System.out.println("Wynik dodawania: " + result);
                    break;
                case 2: // Odejmowanie
                    result = num1 - num2;
                    System.out.println("Wynik odejmowania: " + result);
                    break;
                case 3: // Mnożenie
                    result = num1 * num2;
                    System.out.println("Wynik mnożenia: " + result);
                    break;
                case 4: // Dzielenie
                    if (num2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Wynik dzielenia: " + result);
                    }
                    break;
            }

            System.out.println();
            scanner.nextLine();
        }

        scanner.close();
    }
}