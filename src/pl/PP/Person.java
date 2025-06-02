package pl.PP;

public class Person {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek

    // NOWE POLA zgodnie z zadaniem
    public String address; // pole przechowujące adres
    public int birthYear; // pole przechowujące rok urodzenia

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {
        // Domyślne wartości
        this.forename = "";
        this.surname = "";
        this.age = 0;
        this.address = "";
        this.birthYear = 0;
    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        this.address = "";
        this.birthYear = 2024 - initAge; // obliczamy przybliżony rok urodzenia
    }

    /**
     * Konstruktor z pięcioma parametrami - wszystkie pola
     */
    public Person(String initForename, String initSurname, int initAge, String initAddress, int initBirthYear) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        birthYear = initBirthYear;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
        if (!address.isEmpty()) {
            System.out.println("Mieszkam pod adresem: " + address);
        }
        if (birthYear > 0) {
            System.out.println("Urodziłem się w roku: " + birthYear);
        }
    }

    /**
     * ZMODYFIKOWANA metoda growOld - teraz przyjmuje argument określający o ile lat ma się zestarzeć obiekt
     * Wartość argumentu powinna być między 0 a 10
     */
    public int growOld(int yearsToAge){
        // Sprawdzamy czy argument jest w dopuszczalnym zakresie (0-10)
        if (yearsToAge < 0) {
            System.out.println("Nie można się odmłodzić! Ustawiam na 0.");
            yearsToAge = 0;
        } else if (yearsToAge > 10) {
            System.out.println("Maksymalnie można się zestarzeć o 10 lat na raz! Ustawiam na 10.");
            yearsToAge = 10;
        }

        age = age + yearsToAge;
        System.out.println("Postarzałem się o " + yearsToAge + " lat. Teraz mam " + age + " lat.");
        return age;
    }

    // przykładowa metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }

    // przykładowa metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }

    // NOWE METODY dla pola address
    /**
     * Metoda zwracająca adres obiektu
     */
    public String getAddress(){
        return address;
    }

    /**
     * Metoda ustawiająca adres obiektu
     */
    public void setAddress(String addressToSet){
        address = addressToSet;
        System.out.println("Adres został zmieniony na: " + address);
    }

    // NOWE METODY dla pola birthYear
    /**
     * Metoda zwracająca rok urodzenia obiektu
     */
    public int getBirthYear(){
        return birthYear;
    }

    /**
     * Metoda ustawiająca rok urodzenia obiektu
     */
    public void setBirthYear(int yearToSet){
        if (yearToSet > 1900 && yearToSet <= 2024) {
            birthYear = yearToSet;
            System.out.println("Rok urodzenia został zmieniony na: " + birthYear);
        } else {
            System.out.println("Nieprawidłowy rok urodzenia! Powinien być między 1900 a 2024.");
        }
    }
}