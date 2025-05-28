package pl.PP;
import java.util.Scanner;

public class mojaDrugaAplikacja  {

    public static void main(String[] args) {

        System.out.println("Proszę podaj swoje imię:");
        Scanner scanner = new Scanner(System.in);

        String forename = scanner.nextLine();

        System.out.println("Proszę podaj swoje nazwisko :");
        String surname = scanner.nextLine();


        double x = 10;
        double y = 2;

        Scanner scanner2 = new Scanner(System.in);

        double result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner2.nextDouble();
        double second = scanner2.nextDouble();

        System.out.println("first + second = " + (first + second));

        System.out.println("Witaj " + forename + " " + surname);


        // zadanie 2

        System.out.println("\n--- Zadanie 2, Czesc 1 ---");
        int X2 = 10;
        int X2Doubled = 2 * X2;
        int X2Squared = X2* X2;
        System.out.println("Wartosc x = " + x);
        System.out.println("Dwukrotnosc x = " + X2Doubled);
        System.out.println("Wartosc x^2 = " + X2Squared);

        System.out.println("\n--- Zadanie 2, Czesc 2 ---");
        Scanner ageScanner = new Scanner(System.in);
        System.out.println(" Proszę podaj swój wiek w latach:");
        int wiekWLattach = ageScanner.nextInt();
        long wiekWSekundach = (long) wiekWLattach * 31557600L;
        System.out.println("Twoj wiek w sekundach to: " + wiekWSekundach);

    }
}