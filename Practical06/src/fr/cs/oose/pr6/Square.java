package fr.cs.oose.pr6;

public class Square extends Rectangle {
	
	public Square(Point topLeft, double side) throws BadShapeCreationException {
		super(topLeft, side, side);
	}
	
	public double getSide() {
		return super.getLength();
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	@Override
	public void setLength(double side) {
		setSide(side);
	}
	@Override
	public double maxSide() { return this.getSide(); }
	@Override
	public double minSide() { return this.getSide(); }

	public String toString() {		
		return "A square with side=" + this.getSide() + " which is a subclass of " + super.toString();
	}
}
