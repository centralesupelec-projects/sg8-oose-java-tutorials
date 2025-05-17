package fr.cs.oose.pr6;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}
    public double getY() {return y;}

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj != null && obj.getClass() == this.getClass())
            return ((Point)obj).x==this.x && ((Point)obj).y==this.y;
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (41 * (41*5 + this.x) + this.y);
    }
}
