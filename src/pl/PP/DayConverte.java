package pl.PP;

import java.util.Scanner;

public class DayConverte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program do konwersji dni na tygodnie i dni.");
        System.out.println("Wprowadź wartość niedodatnią (0 lub mniej) aby wyjść.");


        while (true) {
            System.out.print("Podaj liczbę dni: ");



            if (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("To nie jest poprawna liczba. Spróbuj ponownie.");
                continue;
            }

            int totalDays = scanner.nextInt();

            if (totalDays <= 0) {
                System.out.println("Zamykanie programu.");
                break;
            }


            int weeks = totalDays / 7;
            int remainingDays = totalDays % 7;

            System.out.println(totalDays + " dni to " + weeks + " tygodnie i " + remainingDays + " dni.");
        }

        scanner.close();
    }
}