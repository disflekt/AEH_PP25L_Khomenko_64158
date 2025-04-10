import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class liczba {

    public static void main(String[] args) {
        final int ROZMIAR_TABLICY = 6;
        final int MIN_LICZBA = 1;
        final int MAX_LICZBA = 49;

        ArrayList<Integer> tablica1 = new ArrayList<>(ROZMIAR_TABLICY);
        ArrayList<Integer> tablica2 = new ArrayList<>(ROZMIAR_TABLICY);
        Set<Integer> wylosowaneUnikalne = new HashSet<>();
        Set<Integer> wprowadzoneUnikalne = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int licznikPowtorzen = 0;

        // --- Losowanie do tablicy 1 ---
        while (tablica1.size() < ROZMIAR_TABLICY) {
            int losowaLiczba = random.nextInt(MAX_LICZBA) + MIN_LICZBA; //nextInt(bound) daje 0..bound-1
            if (wylosowaneUnikalne.add(losowaLiczba)) { // add zwraca true jesli elementu nie bylo
                tablica1.add(losowaLiczba);
            }
        }

        // --- Wczytywanie od użytkownika do tablicy 2 ---
        System.out.println("Podaj " + ROZMIAR_TABLICY + " różnych liczb z przedziału ["
                + MIN_LICZBA + ", " + MAX_LICZBA + "]:");

        while (tablica2.size() < ROZMIAR_TABLICY) {
            System.out.print("Podaj " + (tablica2.size() + 1) + ". liczbę: ");
            try {
                int wpisanaLiczba = scanner.nextInt();

                if (wpisanaLiczba < MIN_LICZBA || wpisanaLiczba > MAX_LICZBA) {
                    System.out.println("Błąd: Liczba musi być z przedziału [" + MIN_LICZBA + ", " + MAX_LICZBA + "]. Spróbuj ponownie.");
                } else {
                    if (wprowadzoneUnikalne.add(wpisanaLiczba)) { // Sprawdzenie unikalności i dodanie
                        tablica2.add(wpisanaLiczba);
                    } else {
                        System.out.println("Błąd: Ta liczba została już podana. Spróbuj ponownie.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Błąd: Wprowadzono niepoprawne dane. Podaj liczbę całkowitą.");
                scanner.next(); // Skonsumuj niepoprawne dane wejściowe
            }
        }

        // --- Porównanie tablic i zliczanie powtórzeń ---
        for (int liczbaZTablicy2 : tablica2) {
            if (wylosowaneUnikalne.contains(liczbaZTablicy2)) {
                licznikPowtorzen++;
            }
        }

        // --- Wypisanie wyniku ---
        System.out.println("Liczba powtarzających się liczb: " + licznikPowtorzen);

        scanner.close();
    }
}
