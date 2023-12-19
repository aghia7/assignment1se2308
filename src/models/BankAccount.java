package models;

public class BankAccount {
    private int cents;

    public BankAccount(int dollars) {
        deposit(dollars);
    }

    public BankAccount(int dollars, int cents) {
        deposit(dollars, cents);
    }

    public void deposit(int dollars) {
        cents += dollars * 100;
    }

    public void deposit(int dollars, int cents) {
        this.cents += dollars * 100 + cents;
    }

    public double getBalance() {
        return cents / 100.0;
    }
}
