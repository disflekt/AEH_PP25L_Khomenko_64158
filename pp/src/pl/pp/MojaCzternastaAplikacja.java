package pl.pp;

public class MojaCzternastaAplikacja {
    public static void main(String[] args) {
        Pojazd.Osobowy auto = new Pojazd.Osobowy("WE1234X", "1HGCM82633A004352", "Czarny", 50000, 7.2, 30, 123000, new Benzyna(), 5);
        Pojazd.Ciezarowka truck = new Pojazd.Ciezarowka("DW4567Z", "1FTNF20L1YEC12345", "Biały", 90000, 12.5, 50, 234000, new Diesel(), 1200);
        Pojazd.Motocykl motor = new Pojazd.Motocykl("KR8901A", "JH2SC59057M123456", "Czerwony", 15000, 4.0, 15, 34000, new Benzyna(), true);
        Pojazd.SprzetBudowlany koparka = new Pojazd.SprzetBudowlany("KOP001", "SKC1234567890", "Zółty", 150000, 10.0, 40, 8000, new Diesel(), 1200);

        auto.info();
        auto.prowadz(100);
        auto.zatankuj(10);
        auto.prowadz(300);

        System.out.println();

        truck.info();
        truck.prowadz(200);

        System.out.println();

        motor.info();
        motor.prowadz(50);

        System.out.println();

        koparka.info();
        koparka.zatankuj(20);
        koparka.prowadz(80);

    }
}