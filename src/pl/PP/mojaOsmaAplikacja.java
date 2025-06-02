package pl.PP;
import pl.PP.Konto ;

public class mojaOsmaAplikacja {

    public static void main(String[] args) {

        Konto konto1 = new Konto();
        konto1.setNumerKonta("123456789");
        konto1.setImieWlasciciela("Jan");
        konto1.setNazwiskoWlasciciela("Kowalski");
        konto1.setEmailWlasciciela("jan.kowalski@email.com");
        konto1.setTelefonWlasciciela("123-456-789");

        konto1.wyswietlInfo();

        konto1.wyplac(900.0);
        konto1.wyswietlInfo();

        konto1.wplac(250.0);
        konto1.wyswietlInfo();

        String numerKonta = konto1.getNumerKonta();
        double saldo = konto1.getKwotaPieniedzy();
        System.out.println("Pobrane dane: numer konta " + numerKonta + " z saldem = " + saldo + " PLN");

        Konto konto2 = new Konto("987654321", "Anna", "Nowak", "anna.nowak@email.com", "987-654-321", 500.0);
        konto2.wyswietlInfo();
        konto2.setImieWlasciciela("ZmienioneImie");
        konto2.wyswietlInfo();
    }
}