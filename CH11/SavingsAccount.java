package CH11;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds");
        } else {
            setBalance(getBalance() - amount);
        }
    }
}