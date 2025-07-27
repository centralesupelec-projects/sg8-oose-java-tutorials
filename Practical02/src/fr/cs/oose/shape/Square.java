package fr.cs.oose.shape;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }

    @Override
    public void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    public String toString() {
        return "Square with side: " + this.getSide() + " which is subclass of: " + super.toString();
    }
}
