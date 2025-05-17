package fr.cs.oose.pr6;

public class Circle implements Shape {

	private Point center;
	private double radius = 1.0;

	public Circle(Point center, double radius) throws BadShapeCreationException {
		if (radius <= 0.0) {
			throw new BadShapeCreationException();
		}
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() { return center; }
	public void setCenter(Point center) {}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj){
		if (obj == this) return true;
		if (obj != null && obj.getClass() == this.getClass())
			return ((Circle)obj).center==this.center && ((Circle)obj).radius==this.radius;
		return false;
	}

	@Override
	public int hashCode() {
		return (int) (41 * (41*5 + this.center.hashCode()) + this.radius);
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	@Override
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	@Override
	public double maxSide() { return this.radius; }
	@Override
	public double minSide() { return this.radius; }

	public String toString() {		
		return "A circle with radius=" + this.radius + " which is a subclass of " + super.toString();
	}
}
