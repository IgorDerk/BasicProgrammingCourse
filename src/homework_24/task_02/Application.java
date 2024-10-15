package homework_24.task_02;

public class Application {
    public static void main(String[] args) {
        System.out.println("\nBank account:");
        BankAccount bankAccount = new BankAccount(500);
        System.out.printf("Начальный баланс: %.2f €\n", bankAccount.checkBalance());
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(100);
        bankAccount.depositTransfer(50);
        System.out.printf("Текущий баланс: %.2f €\n", bankAccount.checkBalance());


        System.out.println("\nElectronic wallet:");
        ElectronicWallet electronicWallet = new ElectronicWallet(800);
        System.out.printf("Начальный баланс: %.2f $\n", electronicWallet.checkBalance());
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(200);
        electronicWallet.depositTransfer(100);
        System.out.printf("Текущий баланс: %.2f $\n", electronicWallet.checkBalance());
    }
}
