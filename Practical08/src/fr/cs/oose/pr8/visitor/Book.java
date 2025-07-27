package fr.cs.oose.pr8.visitor;

public class Book implements Item {
    private int price;
    private String name;

    public Book(int cost, String name){
        this.price=cost;
        this.name=name;
    }
    public int getPrice() { return price;}
    public String getIsbnNumber() { return name;}

    @Override
    public double accept(Passenger visitor) {
        return visitor.visit(this);
    }
}
