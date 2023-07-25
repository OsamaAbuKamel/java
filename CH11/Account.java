package CH11;

import java.util.Date;
import java.util.GregorianCalendar;


public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    // private GregorianCalendar calendar = new GregorianCalendar();

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // A method named withdraw that withdraws a specified amount from the account.
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", balance='" + getBalance() + "'" +
                ", annualInterestRate='" + getAnnualInterestRate() + "'" +
                ", dateCreated='" + getDateCreated() + "'" +
                "}";
    }

}
