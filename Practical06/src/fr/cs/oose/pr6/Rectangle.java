package fr.cs.oose.pr6;

public class Rectangle implements Shape {

	private Point topLeft = new Point(0,0);
	private double width = 1.0;
	private double length = 1.0;

	public Rectangle(Point topLeft, double width, double length) throws BadShapeCreationException {
		if (width <= 0 || length <= 0) {
			throw new BadShapeCreationException();
		}
		this.topLeft = topLeft;
		this.width = width;
		this.length = length;
	}

	public Point getTopLeft() { return topLeft; }
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}

	public void setTopLeft(Point topLeft) { this.topLeft = topLeft; }
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public boolean equals(Object obj){
		if (obj == this) return true;
		if (obj != null && obj.getClass() == this.getClass())
			return ((Rectangle)obj).topLeft==this.topLeft
					&& ((Rectangle)obj).width==this.width
					&& ((Rectangle)obj).length==this.length;
		return false;
	}

	@Override
	public int hashCode() {
		return (int) (41 * (41*5 * (41*5*7 * this.topLeft.hashCode()) + this.width) + this.length);
	}

	@Override
	public double area() {
		return width*length;
	}
	@Override
	public double perimeter() { return 2*(width+length); }
	@Override
	public double maxSide() { return Math.max(length, width); }
	@Override
	public double minSide() { return Math.min(length, width); }

	public String toString() {		
		return "A rectangle with length=" + this.length + " and width=" + this.width + " and topLeft=" + this.topLeft;
	}
}
