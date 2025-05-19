package fr.cs.oose.pr8.visitor;

// Visitor
public interface Passenger {
    double visit(Book book);
    double visit(Cosmetic cosmetic);
    double visit(Wine wine);
}
