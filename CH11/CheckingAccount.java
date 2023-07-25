package CH11;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = -100;
    }

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < overdraftLimit) {
            System.out.println("Overdraft limit exceeded");
        } else {
            setBalance(getBalance() - amount);
        }
    }
}