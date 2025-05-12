package fr.cs.oose.shape;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
        this.color = "green";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape with color: " + color + " - filled: " + filled;
    }
}
