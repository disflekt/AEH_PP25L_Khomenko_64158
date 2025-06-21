package pl.pp;

public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie; // l/100km lub kWh/100km
    protected double poziomPaliwa;
    protected double przebieg;
    protected TypPaliwa typPaliwa;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, TypPaliwa typPaliwa) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
        this.typPaliwa = typPaliwa;
    }

    public void prowadz(double km) {
        double potrzebnePaliwo = (km * spalanie) / 100;
        if (poziomPaliwa >= potrzebnePaliwo) {
            poziomPaliwa -= potrzebnePaliwo;
            przebieg += km;
            System.out.println("Pojazd przejechał " + km + " km. Pozostało paliwa: " + poziomPaliwa);
        } else {
            System.out.println("Za mało paliwa na przejazd.");
        }
    }

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów. Aktualny poziom paliwa: " + poziomPaliwa);
    }

    public void info() {
        System.out.println(this.getClass().getSimpleName() + " [" + nrRejestracyjny + "] - " + kolor + ", Przebieg: " + przebieg + ", Paliwo: " + typPaliwa.getTypPaliwa());
    }


    public static class Osobowy extends Pojazd {
        private int liczbaDrzwi;
        public Osobowy(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                       double poziomPaliwa, double przebieg, TypPaliwa typPaliwa, int liczbaDrzwi) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
            this.liczbaDrzwi = liczbaDrzwi;
        }
    }
    public static class Ciezarowka extends Pojazd {
        private double ladownosc;

        public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                          double poziomPaliwa, double przebieg, TypPaliwa typPaliwa, double ladownosc) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
            this.ladownosc = ladownosc;
        }
    }
    public static class Motocykl extends Pojazd {
        private boolean posiadaDostawke;

        public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                        double poziomPaliwa, double przebieg, TypPaliwa typPaliwa, boolean posiadaDostawke) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
            this.posiadaDostawke = posiadaDostawke;
        }
    }
    public static class SprzetBudowlany extends Pojazd {
        private int przepracowaneGodziny;

        public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                               double poziomPaliwa, double przebieg, TypPaliwa typPaliwa, int przepracowaneGodziny) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
            this.przepracowaneGodziny = przepracowaneGodziny;
        }
    }
}