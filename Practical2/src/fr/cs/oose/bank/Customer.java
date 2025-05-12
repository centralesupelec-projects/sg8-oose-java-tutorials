package fr.cs.oose.bank;

public class Customer {
    private static int id = 0;
    private int customerId;
    private String name;

    public Customer(String name) {
        this.name = name;
        id++;
        customerId = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return  "Id: " + customerId + " | Name: " + this.name;
    }
}
