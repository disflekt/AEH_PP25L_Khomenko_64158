package pl.PP;
import java.util.Scanner;

public class mojTrzeciaAplikacja {

    public static void main(String[] args) {

        /*
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
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj proszę liczbę większą od 100:");


        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: " + number1);


        double number2;
        do {
            System.out.println("Podaj proszę liczbę większą od 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: " + number2);


        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);
        }
        System.out.println("Podaj proszę liczbę x: ");
        var x = scanner.nextDouble();
        System.out.println("Podaj proszę liczbę y: ");
        var y = scanner.nextDouble();

        if(x > y){
            System.out.println("x jest większe od y");
        } else if (x < y) {
            System.out.println("x jest mniejsze od y");
        } else {
            System.out.println("x jest równe y");
        }


        while(true)
        {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if(input == -1){
                System.out.println("Wyjście...");
                break;
            }
        }
        scanner.close();
        
    }
}