package fr.cs.oose.bank;

public class Account {
    private static int id = 0;
    private int accountId;
    private double balance;
    private Customer owner;

    public Account(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
        id++;
        accountId = id;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void removeMoney(double amount) {
        balance -= amount;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
