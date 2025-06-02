package pl.PP;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {

        // Удаляем/комментируем предыдущий демонстрационный код
        /*
        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji
        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #1 to " + finalScore);
        }

        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)
        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #2 to " + finalScore);
        }

        // Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody
        System.out.println("Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody");
        calculateScore_noArguments();

        // Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody
        System.out.println("Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody");
        calculateScore_arguments(true, 2500, 9, 2500);
        // można to wywołać za pomocą wcześniej zadeklarowanych zmiennych
        calculateScore_arguments(gameOver, score, levelCompleted, bonus);

        // Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać
        System.out.println("Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać za pomocą return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Twoj wynik #5 to " + finalScore);
        */

        // NOWE ZADANIE: Obliczanie potęgi liczby N metodą iteracyjną i rekurencyjną
        System.out.println("=== Obliczanie potęgi liczby - porównanie metod ===");

        int podstawa = 2;
        int wykladnik = 10;

        System.out.println("Obliczamy " + podstawa + "^" + wykladnik);
        System.out.println();

        // Test metody iteracyjnej z pomiarem czasu
        System.out.println("--- METODA ITERACYJNA ---");
        long startTime = System.nanoTime();
        long wynikIteracyjny = potegaIteracyjna(podstawa, wykladnik);
        long endTime = System.nanoTime();
        long czasIteracyjny = endTime - startTime;

        System.out.println("Wynik (iteracyjna): " + wynikIteracyjny);
        System.out.println("Czas wykonania: " + czasIteracyjny + " nanosekund");
        System.out.println();

        // Test metody rekurencyjnej z pomiarem czasu
        System.out.println("--- METODA REKURENCYJNA ---");
        startTime = System.nanoTime();
        long wynikRekurencyjny = potegaRekurencyjna(podstawa, wykladnik);
        endTime = System.nanoTime();
        long czasRekurencyjny = endTime - startTime;

        System.out.println("Wynik (rekurencyjna): " + wynikRekurencyjny);
        System.out.println("Czas wykonania: " + czasRekurencyjny + " nanosekund");
        System.out.println();

        // Porównanie czasów
        System.out.println("--- PORÓWNANIE ---");
        if (czasIteracyjny < czasRekurencyjny) {
            System.out.println("Metoda iteracyjna była szybsza o " + (czasRekurencyjny - czasIteracyjny) + " nanosekund");
        } else if (czasRekurencyjny < czasIteracyjny) {
            System.out.println("Metoda rekurencyjna była szybsza o " + (czasIteracyjny - czasRekurencyjny) + " nanosekund");
        } else {
            System.out.println("Obie metody wykonały się w tym samym czasie");
        }

        // Test z większymi liczbami
        System.out.println("\n=== Test z większymi wartościami ===");
        testWydajnosci(5, 15);
        testWydajnosci(3, 20);
    }

    /**
     * Metoda iteracyjna do obliczania potęgi
     * @param podstawa - liczba podstawowa
     * @param wykladnik - wykładnik potęgi
     * @return wynik potęgowania
     */
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

    /**
     * Metoda rekurencyjna do obliczania potęgi
     * @param podstawa - liczba podstawowa
     * @param wykladnik - wykładnik potęgi
     * @return wynik potęgowania
     */
    private static long potegaRekurencyjna(int podstawa, int wykladnik) {
        // Przypadek bazowy
        if (wykladnik == 0) {
            return 1;
        }
        if (wykladnik == 1) {
            return podstawa;
        }

        // Rekurencyjne wywołanie
        return podstawa * potegaRekurencyjna(podstawa, wykladnik - 1);
    }

    /**
     * Metoda pomocnicza do testowania wydajności obu metod
     * @param podstawa - liczba podstawowa
     * @param wykladnik - wykładnik potęgi
     */
    private static void testWydajnosci(int podstawa, int wykladnik) {
        System.out.println("Test dla " + podstawa + "^" + wykladnik + ":");

        // Test iteracyjny
        long start = System.nanoTime();
        long wynikIter = potegaIteracyjna(podstawa, wykladnik);
        long czasIter = System.nanoTime() - start;

        // Test rekurencyjny
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

    /*
    // ZAKOMENTOWANE STARE METODY:
    private static void calculateScore_noArguments() {
        boolean gameOver = true;
        int score = 150;
        int levelCompleted = 2;
        int bonus = 1000;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #3 to " + finalScore);
        }
    }

    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #4 to " + finalScore);
        }
    }

    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
    */
}