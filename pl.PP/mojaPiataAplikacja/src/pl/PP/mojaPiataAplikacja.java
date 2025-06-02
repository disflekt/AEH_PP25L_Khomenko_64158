package pl.PP;

public class mojaPiataAplikacja {
    public static void main(String[] args) {


        System.out.println("=== Demonstracja nowej metody ===");


        displayPattern("*", 5, 3);

        System.out.println(); // Pusta linia dla separacji


        displayPattern("#", 8, 4);

        System.out.println(); // Pusta linia dla separacji


        displayPattern("@", 10, 2);
    }


    private static void displayPattern(String znak, int liczbaZnakow, int liczbLinii) {
        System.out.println("Wyświetlam wzór ze znakiem: " + znak);
        System.out.println("Liczba znaków w linii: " + liczbaZnakow);
        System.out.println("Liczba linii: " + liczbLinii);
        System.out.println("Wzór:");


        for (int i = 0; i < liczbLinii; i++) {

            for (int j = 0; j < liczbaZnakow; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
        System.out.println("--- Koniec wzoru ---");
    }
}