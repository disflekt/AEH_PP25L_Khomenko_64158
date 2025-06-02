package pl.PP;

public class Konto {

    private String numerKonta;
    private String imieWlasciciela;
    private String nazwiskoWlasciciela;
    private String emailWlasciciela;
    private String telefonWlasciciela;
    private double kwotaPieniedzy;


    public Konto() {
        this.kwotaPieniedzy = 1000.0; // Początkowa kwota PLN 1000
    }


    public Konto(String numerKonta, String imieWlasciciela, String nazwiskoWlasciciela,
                 String emailWlasciciela, String telefonWlasciciela, double kwotaPieniedzy) {
        this.numerKonta = numerKonta;
        this.imieWlasciciela = imieWlasciciela;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
        this.emailWlasciciela = emailWlasciciela;
        this.telefonWlasciciela = telefonWlasciciela;
        this.kwotaPieniedzy = kwotaPieniedzy;
    }


    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }

    public void setImieWlasciciela(String imieWlasciciela) {
        this.imieWlasciciela = imieWlasciciela;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }

    public void setNazwiskoWlasciciela(String nazwiskoWlasciciela) {
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public String getEmailWlasciciela() {
        return emailWlasciciela;
    }

    public void setEmailWlasciciela(String emailWlasciciela) {
        this.emailWlasciciela = emailWlasciciela;
    }

    public String getTelefonWlasciciela() {
        return telefonWlasciciela;
    }

    public void setTelefonWlasciciela(String telefonWlasciciela) {
        this.telefonWlasciciela = telefonWlasciciela;
    }

    public double getKwotaPieniedzy() {
        return kwotaPieniedzy;
    }

    public void setKwotaPieniedzy(double kwotaPieniedzy) {
        this.kwotaPieniedzy = kwotaPieniedzy;
    }


    public void wplac(double kwota) {
        if (kwota > 0) {
            this.kwotaPieniedzy += kwota;
            System.out.println("Wpłacono " + kwota + " PLN. Nowe saldo: " + this.kwotaPieniedzy + " PLN");
        } else {
            System.out.println("Kwota do wpłaty musi być większa od 0");
        }
    }

    
    public void wyplac(double kwota) {
        if (kwota > 0 && kwota <= this.kwotaPieniedzy) {
            this.kwotaPieniedzy -= kwota;
            System.out.println("Wypłacono " + kwota + " PLN. Pozostałe saldo: " + this.kwotaPieniedzy + " PLN");
        } else if (kwota > this.kwotaPieniedzy) {
            System.out.println("Brak środków. Maksymalna kwota do wypłaty: " + this.kwotaPieniedzy + " PLN");
        } else {
            System.out.println("Kwota do wypłaty musi być większa od 0");
        }
    }


    public void wyswietlInfo() {
        System.out.println("=== INFORMACJE O KONCIE ===");
        System.out.println("Numer konta: " + numerKonta);
        System.out.println("Właściciel: " + imieWlasciciela + " " + nazwiskoWlasciciela);
        System.out.println("Email: " + emailWlasciciela);
        System.out.println("Telefon: " + telefonWlasciciela);
        System.out.println("Saldo: " + kwotaPieniedzy + " PLN");
        System.out.println("===========================");
    }
}