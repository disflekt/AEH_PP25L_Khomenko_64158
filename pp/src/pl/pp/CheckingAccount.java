package pl.pp;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для снятия должна быть положительной.");
            return;
        }

        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.printf("Счет %s: Снято %.2f. Новый баланс: %.2f%n", accountNumber, amount, balance);
        } else {
            System.out.println("Снятие невозможно. Превышен лимит овердрафта.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.printf("--- Текущий счет ---\nНомер: %s\nВладелец: %s\nБаланс: %.2f\nЛимит овердрафта: %.2f%n",
                accountNumber, ownerName, balance, overdraftLimit);
    }
}