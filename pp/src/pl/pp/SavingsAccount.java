package pl.pp;


public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для снятия должна быть положительной.");
            return;
        }


        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Счет %s: Снято %.2f. Новый баланс: %.2f%n", accountNumber, amount, balance);
        } else {
            System.out.println("Снятие невозможно. Недостаточно средств.");
        }
    }


    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("Счет %s: Начислены проценты %.2f. Новый баланс: %.2f%n", accountNumber, interest, balance);
    }

    @Override
    public void displayAccountInfo() {
        System.out.printf("--- Сберегательный счет ---\nНомер: %s\nВладелец: %s\nБаланс: %.2f\nПроцентная ставка: %.2f%%%n",
                accountNumber, ownerName, balance, interestRate * 100);
    }
}