package CH11;

public class Driver {
    public static void main(String[] args) {
        // Act11_1 act11_1 = new Act11_1(5, 4, 8, "red", true);
        // System.out.println(act11_1.toString());
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(45);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Monthly Interest is: " + account.getMonthlyInterest());
        System.out.println("Date Created is: " + account.getDateCreated());
        System.out.println("Balance is: " + account.getBalance());
        System.out.println(account.toString());
        System.out.println("============================================");
        CheckingAccount checkingAccount = new CheckingAccount(1122, 20000, 1000);
        checkingAccount.setAnnualInterestRate(45);
        checkingAccount.withdraw(2500);
        checkingAccount.deposit(3000);
        System.out.println("Monthly Interest is: " + checkingAccount.getMonthlyInterest());
        System.out.println("Date Created is: " + checkingAccount.getDateCreated());
        System.out.println("Balance is: " + checkingAccount.getBalance());
        System.out.println(checkingAccount.toString());
        System.out.println("============================================");

        SavingsAccount savingsAccount = new SavingsAccount(1122, 20000);
        savingsAccount.setAnnualInterestRate(45);
        savingsAccount.withdraw(2500);
        savingsAccount.deposit(3000);
        System.out.println("Monthly Interest is: " + savingsAccount.getMonthlyInterest());
        System.out.println("Date Created is: " + savingsAccount.getDateCreated());
        System.out.println("Balance is: " + savingsAccount.getBalance());
        System.out.println(savingsAccount.toString());


    }
}
