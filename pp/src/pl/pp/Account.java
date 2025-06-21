package pl.pp;

public abstract class Account {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;


    public Account(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Счет %s: Внесено %.2f. Новый баланс: %.2f%n", accountNumber, amount, balance);
        } else {
            System.out.println("Сумма для внесения должна быть положительной.");
        }
    }

    // Метод для снятия будет разным для разных счетов, поэтому он абстрактный
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    // Абстрактный метод для вывода информации о счете
    public abstract void displayAccountInfo();
}
