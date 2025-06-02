package pl.PP;

public class mojaPiataAplikacja {
    public static void main(String[] args) {

        // Wywołanie nowej metody z różnymi argumentami
        System.out.println("=== Demonstracja nowej metody ===");

        // Pierwsze wywołanie
        displayPattern("*", 5, 3);

        System.out.println(); // Pusta linia dla separacji

        // Drugie wywołanie
        displayPattern("#", 8, 4);

        System.out.println(); // Pusta linia dla separacji

        // Trzecie wywołanie
        displayPattern("@", 10, 2);
    }


    private static void displayPattern(String znak, int liczbaZnakow, int liczbLinii) {
        System.out.println("Wyświetlam wzór ze znakiem: " + znak);
        System.out.println("Liczba znaków w linii: " + liczbaZnakow);
        System.out.println("Liczba linii: " + liczbLinii);
        System.out.println("Wzór:");

        // Pętla dla liczby linii
        for (int i = 0; i < liczbLinii; i++) {
            // Pętla dla liczby znaków w każdej linii
            for (int j = 0; j < liczbaZnakow; j++) {
                System.out.print(znak);
            }
            System.out.println(); // Nowa linia po każdym rzędzie
        }
        System.out.println("--- Koniec wzoru ---");
    }
}