package fr.cs.oose.circle;

public class Square {
    private double side = 0.0;

    public Square(double side) {
        this.side = side;
    }

    public boolean inscribed(Circle c) {
        return this.side <= Math.sqrt(2)*c.getRadius();
    }

    public double getSide() {
        return this.side;
    }

    public String toString() {
        return "Square - " + this.side;
    }
}
