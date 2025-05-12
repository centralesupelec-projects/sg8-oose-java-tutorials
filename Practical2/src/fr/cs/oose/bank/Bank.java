package fr.cs.oose.bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private List<CurrentAccount> currentAccounts = new ArrayList<>();
    private List<SavingAccount> savingAccounts = new ArrayList<>();

    public Customer addCustomer(String name) {
        Customer newCustomer = new Customer(name);
        customers.add(newCustomer);
        return newCustomer;
    }

    public CurrentAccount addCurrentAccount(double balance, double threshold, Customer owner) {
        CurrentAccount currentAccount = new CurrentAccount(balance, threshold, owner);
        currentAccounts.add(currentAccount);
        return currentAccount;
    }

    public SavingAccount addSavingAccount(double balance, double interest, Customer owner) {
        SavingAccount savingAccount = new SavingAccount(balance, interest, owner);
        savingAccounts.add(savingAccount);
        return savingAccount;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<CurrentAccount> getCurrentAccounts() {
        return currentAccounts;
    }

    public List<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
        this.currentAccounts = currentAccounts;
    }

    public void setSavingAccounts(List<SavingAccount> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }

    public String toString() {
        String s = "** Customers **: \n";
        StringBuilder customer_string = new StringBuilder();
        for (Customer c : customers) {
            customer_string.append(c.toString());
            customer_string.append("\n");
        }
        s += customer_string.toString();

        s += "** Current Accounts **: \n";
        StringBuilder caccount_string = new StringBuilder();
        for (CurrentAccount c : currentAccounts) {
            caccount_string.append(c.toString());
            caccount_string.append("\n");
        }
        s += caccount_string.toString();

        s += "** Saving Accounts **: \n";
        StringBuilder saccount_string = new StringBuilder();
        for (SavingAccount c : savingAccounts) {
            saccount_string.append(c.toString());
            saccount_string.append("\n");
        }
        s += saccount_string.toString();
        return s;
    }

    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1\n\n");
        Bank bank = new Bank();
        Customer c1 = bank.addCustomer("Smith");
        Customer c2 = bank.addCustomer("Davies");

        CurrentAccount a1 = bank.addCurrentAccount(0, -500, c1);
        a1.addMoney(1000);
        a1.removeMoney(100);
        a1.removeMoney(2000);

        SavingAccount s1 = bank.addSavingAccount(0, 3, c1);
        s1.addMoney(500);
        CurrentAccount a2 = bank.addCurrentAccount(0, 0, c2);
        a2.addMoney(800);

        System.out.println(bank);
    }
}
