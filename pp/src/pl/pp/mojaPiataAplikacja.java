package pl.pp;

import java.awt.*;
import java.util.Scanner;

public class mojaPiataAplikacja {
    //    public static void main(String[] args) {
//
//        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji
//        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji");
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Twoj wynik #1 to " + finalScore);
//        }
//
//        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)
//        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)");
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Twoj wynik #2 to " + finalScore);
//        }
//
//        // Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody
//        System.out.println("Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody");
//        calculateScore_noArguments();
//
//        // Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody
//        System.out.println("Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody");
//        calculateScore_arguments(true, 2500, 9, 2500);
//        // można to wywołać za pomocą wcześniej zadeklarowanych zmiennych
//        calculateScore_arguments(gameOver, score, levelCompleted, bonus);
//        // ale widzicie, że wyświetlanie funkcji jest również z numerkiem #4 (bo takie wyświetlanie jest zapisane
//        // w metodzie. Co zrobić, żeby tak nie było? Poniżej:
//
//        // Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać
//        System.out.println("Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać za pomocą return");
//        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
//        System.out.println("Twoj wynik #5 to " + finalScore);
//    }
//
//    private static void calculateScore_noArguments() {
//        boolean gameOver = true;
//        int score = 150;
//        int levelCompleted = 2;
//        int bonus = 1000;
//
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Twoj wynik #3 to " + finalScore);
//        }
//    }
//    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Twoj wynik #4 to " + finalScore);
//        }
//    }
//    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//        }
//        return finalScore;
//    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sign, count of column and row: ");

        char sign = scanner.next().charAt(0);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();

        System.out.println("Your sign is - \u001B[31m" + sign);
        System.out.println("\u001B[0m");

        print(sign, num_1, num_2);
    }

    private static void print (char sign, int num_1, int num_2) {
        for(int i = 0; i < num_1; i++) {
            System.out.println(i+1 + ". " + String.valueOf(sign).repeat(Math.max(0, num_2)));
        }
    }
}