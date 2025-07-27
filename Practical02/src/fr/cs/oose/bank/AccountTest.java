package fr.cs.oose.bank;

public class AccountTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");
        // CurrentAccount Test
        CurrentAccount account1 = new CurrentAccount(100, -200, c1);
        System.out.println(account1);

        // SavingAccount Test
        SavingAccount account2 = new SavingAccount(1000, 4, c2);
        account2.launchInterests();
        System.out.println(account2);
    }
}
