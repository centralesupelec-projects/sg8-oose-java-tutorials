package fr.cs.oose.pr8.visitor;

public class CorporatePassenger implements Passenger {
    @Override
    public double visit(Book book) {
        return book.getPrice() * 1.07;
    }

    @Override
    public double visit(Cosmetic cosmetic) {
        return cosmetic.getPrice() * 1.2;
    }

    @Override
    public double visit(Wine wine) {
        return wine.getPrice() * 1.2;
    }
}
