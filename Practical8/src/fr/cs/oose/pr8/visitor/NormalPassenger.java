package fr.cs.oose.pr8.visitor;

public class NormalPassenger implements Passenger {
    @Override
    public double visit(Book book) {
        return book.getPrice() * 1.1;
    }

    @Override
    public double visit(Cosmetic cosmetic) {
        return cosmetic.getPrice() * 1.3;
    }

    @Override
    public double visit(Wine wine) {
        return wine.getPrice() * 1.32;
    }
}
