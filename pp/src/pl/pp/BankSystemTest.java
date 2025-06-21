package pl.pp;

import java.util.ArrayList;
import java.util.List;

public class BankSystemTest {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();


        Account checking = new CheckingAccount("C001", "Jan Kowalski", 1000, 500);
        SavingsAccount savings = new SavingsAccount("S001", "Anna Nowak", 5000, 0.05);

        accounts.add(checking);
        accounts.add(savings);

        System.out.println("--- Начальное состояние счетов ---");
        for (Account acc : accounts) {
            acc.displayAccountInfo();
            System.out.println();
        }

        System.out.println("\n--- Проводим операции ---");


        System.out.println("Операции со счетом C001:");
        checking.deposit(200);
        checking.withdraw(1600);
        checking.withdraw(200);
        System.out.println();


        System.out.println("Операции со счетом S001:");
        savings.withdraw(1000);
        savings.applyInterest();
        savings.withdraw(6000);
        System.out.println();


        System.out.println("\n--- Конечное состояние счетов ---");
        for (Account acc : accounts) {
            acc.displayAccountInfo();
            System.out.println();
        }
    }
}