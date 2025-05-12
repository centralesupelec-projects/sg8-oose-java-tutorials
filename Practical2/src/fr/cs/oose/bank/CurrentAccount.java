package fr.cs.oose.bank;

public class CurrentAccount extends Account {
    private double threshold;

    public CurrentAccount(double balance, double threshold, Customer owner) {
        super(balance, owner);
        this.threshold = threshold;
    }

    public void removeMoney(double amount) {
        double balance = this.getBalance();
        if (balance - amount > threshold) {
            this.setBalance(balance - amount);
        } else {
            System.out.println("You can't withdraw that money, you have: " + balance);
        }
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public String toString() {
        return  "Current Account ID: " + this.getAccountId() + " | Balance: " + this.getBalance() + " | Threshold: " + threshold + "\n" + "---> Owner: " + this.getOwner().toString();
    }
}
