package Task3.HomeWork;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.printAccount();
        bankAccount.deposit(20000);
        while (bankAccount.getAmount() > 0) {
            bankAccount.withDraw(6000);
        }
    }
}
