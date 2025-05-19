package fr.cs.oose.pr8.visitor;

// Visitable
public interface Item {
    public double accept(Passenger visitor);
}
