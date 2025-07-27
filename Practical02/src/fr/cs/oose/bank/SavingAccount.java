package fr.cs.oose.bank;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, double interestRate, Customer owner) {
        super(balance, owner);
        this.interestRate = interestRate;
    }

    public void launchInterests() {
        double balance = this.getBalance();
        this.setBalance(balance * (1 + interestRate/100));
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return  "Saving Account ID: " + this.getAccountId() + " | Balance: " + this.getBalance() + " | Interest rate: " + this.interestRate + "\n" + "--> Owner: " + this.getOwner().toString();
    }
}
