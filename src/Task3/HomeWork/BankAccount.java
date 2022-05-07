package Task3.HomeWork;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы пополнили счёт на сумму: " + sum);
        printAccount();
    }

    public void withDraw(int sum) {
        if (sum > amount) {
            try {
                throw new LimitException("Запрашиваемая вами сумма превышает остаток на счете! \nВы сняли ", amount);
            } catch (LimitException e) {
                amount = 0;
                System.out.println(e.getMessage() + e.getRemainingAmount());
            }
        } else {
            amount -= sum;
            System.out.println("Вы сняли " + (double) sum);
        }
        if (amount < 0) {
            amount = 0;
        }
        printAccount();
    }

    public void printAccount() {
        System.out.println("Ваш остаток составляет: " + getAmount());
    }
}
