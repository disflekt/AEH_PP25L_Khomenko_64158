package pl.PP;

public class Person {

    public String forename;
    public String surname;
    public int age;


    public String address;
    public int birthYear;


    public Person() {

        this.forename = "";
        this.surname = "";
        this.age = 0;
        this.address = "";
        this.birthYear = 0;
    }


    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        this.address = "";
        this.birthYear = 2024 - initAge;
    }


    public Person(String initForename, String initSurname, int initAge, String initAddress, int initBirthYear) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        birthYear = initBirthYear;
    }


    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
        if (!address.isEmpty()) {
            System.out.println("Mieszkam pod adresem: " + address);
        }
        if (birthYear > 0) {
            System.out.println("Urodziłem się w roku: " + birthYear);
        }
    }


    public int growOld(int yearsToAge){

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


    public String getName(){
        return forename;
    }


    public void setName(String nameToSet){
        forename = nameToSet;
    }


    public String getAddress(){
        return address;
    }


    public void setAddress(String addressToSet){
        address = addressToSet;
        System.out.println("Adres został zmieniony na: " + address);
    }


    public int getBirthYear(){
        return birthYear;
    }


    public void setBirthYear(int yearToSet){
        if (yearToSet > 1900 && yearToSet <= 2024) {
            birthYear = yearToSet;
            System.out.println("Rok urodzenia został zmieniony na: " + birthYear);
        } else {
            System.out.println("Nieprawidłowy rok urodzenia! Powinien być między 1900 a 2024.");
        }
    }
}