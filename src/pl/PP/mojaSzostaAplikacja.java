package pl.PP;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {




        System.out.println("=== Obliczanie potęgi liczby - porównanie metod ===");

        int podstawa = 2;
        int wykladnik = 10;

        System.out.println("Obliczamy " + podstawa + "^" + wykladnik);
        System.out.println();


        System.out.println("--- METODA ITERACYJNA ---");
        long startTime = System.nanoTime();
        long wynikIteracyjny = potegaIteracyjna(podstawa, wykladnik);
        long endTime = System.nanoTime();
        long czasIteracyjny = endTime - startTime;

        System.out.println("Wynik (iteracyjna): " + wynikIteracyjny);
        System.out.println("Czas wykonania: " + czasIteracyjny + " nanosekund");
        System.out.println();


        System.out.println("--- METODA REKURENCYJNA ---");
        startTime = System.nanoTime();
        long wynikRekurencyjny = potegaRekurencyjna(podstawa, wykladnik);
        endTime = System.nanoTime();
        long czasRekurencyjny = endTime - startTime;

        System.out.println("Wynik (rekurencyjna): " + wynikRekurencyjny);
        System.out.println("Czas wykonania: " + czasRekurencyjny + " nanosekund");
        System.out.println();


        System.out.println("--- PORÓWNANIE ---");
        if (czasIteracyjny < czasRekurencyjny) {
            System.out.println("Metoda iteracyjna była szybsza o " + (czasRekurencyjny - czasIteracyjny) + " nanosekund");
        } else if (czasRekurencyjny < czasIteracyjny) {
            System.out.println("Metoda rekurencyjna była szybsza o " + (czasIteracyjny - czasRekurencyjny) + " nanosekund");
        } else {
            System.out.println("Obie metody wykonały się w tym samym czasie");
        }


        System.out.println("\n=== Test z większymi wartościami ===");
        testWydajnosci(5, 15);
        testWydajnosci(3, 20);
    }


    private static long potegaIteracyjna(int podstawa, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        }

        long wynik = 1;
        for (int i = 0; i < wykladnik; i++) {
            wynik *= podstawa;
        }
        return wynik;
    }


    private static long potegaRekurencyjna(int podstawa, int wykladnik) {

        if (wykladnik == 0) {
            return 1;
        }
        if (wykladnik == 1) {
            return podstawa;
        }


        return podstawa * potegaRekurencyjna(podstawa, wykladnik - 1);
    }


    private static void testWydajnosci(int podstawa, int wykladnik) {
        System.out.println("Test dla " + podstawa + "^" + wykladnik + ":");


        long start = System.nanoTime();
        long wynikIter = potegaIteracyjna(podstawa, wykladnik);
        long czasIter = System.nanoTime() - start;


        start = System.nanoTime();
        long wynikRek = potegaRekurencyjna(podstawa, wykladnik);
        long czasRek = System.nanoTime() - start;

        System.out.println("  Iteracyjna: " + wynikIter + " (czas: " + czasIter + " ns)");
        System.out.println("  Rekurencyjna: " + wynikRek + " (czas: " + czasRek + " ns)");

        if (czasIter < czasRek) {
            System.out.println("  → Iteracyjna szybsza o " + (czasRek - czasIter) + " ns");
        } else {
            System.out.println("  → Rekurencyjna szybsza o " + (czasIter - czasRek) + " ns");
        }
        System.out.println();
    }

}