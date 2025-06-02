package pl.PP;

import pl.PP.Person;

public class mojaSiodmaAplikacja {
    public static void main(String[] args) {

        // Usuwamy/komentujemy poprzedni kod demonstracyjny
        /*
        Person person1 = new Person(); // utworzenie obiektu person1 klasy Person z domyślnymi parametrami/cechami
        person1.hiToAll(); // domyślnie pola są puste albo są zerami więc to właśnie powinno się wyświetlić

        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.hiToAll(); // teraz powinny się wyświetlić wartości, które przed chwilą wpisaliśmy jako cechy obiektu

        // wiedząc, że mamy konstruktor obiektu, który nie jest pusty, ale przyjmuje pewne cechy to można
        // zainicjalizować obiekt w jednej linijce zamiast wpisywać wartości w każde pole jak wyżej

        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.hiToAll();

        // można teraz wykorzystać metodę growOld() np. jeden raz dla obiektu person1 i trzy razy dla obiektu person2
        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }
        // i wyświetlić wiek końcowy, czy wszystko się zgadza?
        person1.hiToAll();
        person2.hiToAll();

        // zamiast odwoływać się do konkretnych pól obiektu można napisać metody, które ustawiają np. zmienną
        // forename albo ją odczytują i skorzystać z tych metod
        System.out.println(person1.getName()); // odczytaj forename z obiektu za pomocą metody (patrz - kod klasy Person)
        person1.setName("Lolo"); // zmień pole forename w obiekcie person1
        System.out.println(person1.getName()); // sprawdź czy forename w obiekcie person1 się zmieniło
        person1.hiToAll();
        */

        System.out.println("=== NOWA APLIKACJA - Test zmodyfikowanej metody growOld() ===");
        System.out.println();

        Person person1 = new Person();
        person1.forename = "Anna";
        person1.surname = "Kowalska";
        person1.age = 25;
        person1.address = "ul. Główna 15, Warszawa";
        person1.birthYear = 1999;

        System.out.println("=== OSOBA 1 - Stan początkowy ===");
        person1.hiToAll();
        System.out.println();


        Person person2 = new Person("Marek", "Nowak", 30);
        person2.setAddress("ul. Słoneczna 8, Kraków");

        System.out.println("=== OSOBA 2 - Stan początkowy ===");
        person2.hiToAll();
        System.out.println();


        Person person3 = new Person("Katarzyna", "Wiśniewska", 22, "ul. Różana 3, Gdańsk", 2002);

        System.out.println("=== OSOBA 3 - Stan początkowy ===");
        person3.hiToAll();
        System.out.println();


        System.out.println("=== TESTOWANIE METODY growOld() Z ARGUMENTEM ===");


        System.out.println("--- Test 1: Osoba 1 starzeje się o 3 lata ---");
        person1.growOld(3);
        person1.hiToAll();
        System.out.println();


        System.out.println("--- Test 2: Osoba 2 starzeje się o 10 lat ---");
        person2.growOld(10);
        person2.hiToAll();
        System.out.println();


        System.out.println("--- Test 3: Osoba 3 próbuje się zestarzeć o 15 lat (powinno być ograniczone do 10) ---");
        person3.growOld(15);
        person3.hiToAll();
        System.out.println();


        System.out.println("--- Test 4: Osoba 1 próbuje się odmłodzić o -5 lat (powinno być ustawione na 0) ---");
        person1.growOld(-5);
        person1.hiToAll();
        System.out.println();


        System.out.println("--- Test 5: Osoba 2 starzeje się o 0 lat ---");
        person2.growOld(0);
        person2.hiToAll();
        System.out.println();


        System.out.println("=== TESTOWANIE NOWYCH METOD (getters/setters) ===");



        System.out.println("--- Test metod dla adresu ---");
        System.out.println("Aktualny adres osoby 1: " + person1.getAddress());
        person1.setAddress("ul. Nowa 99, Poznań");
        System.out.println("Nowy adres osoby 1: " + person1.getAddress());
        System.out.println();


        System.out.println("--- Test metod dla roku urodzenia ---");
        System.out.println("Aktualny rok urodzenia osoby 2: " + person2.getBirthYear());
        person2.setBirthYear(1994);
        System.out.println("Nowy rok urodzenia osoby 2: " + person2.getBirthYear());


        System.out.println("Próba ustawienia nieprawidłowego roku (1800):");
        person2.setBirthYear(1800);
        System.out.println();


        System.out.println("=== STAN KOŃCOWY WSZYSTKICH OSÓB ===");
        System.out.println("Osoba 1:");
        person1.hiToAll();
        System.out.println();

        System.out.println("Osoba 2:");
        person2.hiToAll();
        System.out.println();

        System.out.println("Osoba 3:");
        person3.hiToAll();
    }
}