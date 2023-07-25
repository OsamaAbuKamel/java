package javaFX;

public class Loan {
    private double interest;
    private int year;
    private double loanAmount;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double interest, int year, double loanAmount) {
        this.interest = interest;
        this.year = year;
        this.loanAmount = loanAmount;
    }

    public double getInterest() {
        return this.interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.interest / 1200;
        double monthlyPayment = this.loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, this.year * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = this.getMonthlyPayment() * this.year * 12;
        return totalPayment;
    }
}