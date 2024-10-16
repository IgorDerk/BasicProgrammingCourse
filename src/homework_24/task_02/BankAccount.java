package homework_24.task_02;

public class BankAccount implements PaymentSystem {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Списано %.2f €. Новый баланс: %.2f €\n", amount, balance);
        } else {
            System.out.println("Недостаточно средств на счете!");
        }

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.printf("Зачисленно %.2f €. Новый баланс: %.2f €\n", amount, balance);

    }

    @Override
    public double checkBalance() {
        return balance;

    }

}
