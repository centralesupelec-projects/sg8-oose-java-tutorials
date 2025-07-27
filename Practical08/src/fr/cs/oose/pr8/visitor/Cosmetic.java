package fr.cs.oose.pr8.visitor;

public class Cosmetic implements Item {
    private int price;
    private Cosmetics type;

    public Cosmetic(int cost, Cosmetics type) {
        this.price=cost;
        this.type=type;
    }
    public int getPrice() { return price;}
    public String getType() { return type.toString(); }

    @Override
    public double accept(Passenger visitor) {
        return visitor.visit(this);
    }
}
