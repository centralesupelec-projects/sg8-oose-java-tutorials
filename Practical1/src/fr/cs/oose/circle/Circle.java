package fr.cs.oose.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle - Radius is: " + this.radius + " | Color is: " + this.color;
    }

    public boolean inscribed(Square s) {
        return this.radius <= s.getSide()/2;
    }
}
