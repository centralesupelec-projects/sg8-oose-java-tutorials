package fr.cs.oose.pr8.visitor;

public class Wine implements Item {
    private int price;

    public Wine(int cost){
        this.price=cost;
    }
    public int getPrice() { return price;}

    @Override
    public double accept(Passenger visitor) {
        return visitor.visit(this);
    }
}
