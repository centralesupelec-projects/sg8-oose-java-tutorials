package fr.cs.oose.pr6;

import java.util.ArrayList;
import java.util.Comparator;

public class PracticalDemo {
	
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		ShapeFactory factory = new ShapeFactory();

		// Creating Shapes with factory pattern
		Shape circle = factory.createShape("CIRCLE");
		Shape rectangle = factory.createShape("RECTANGLE");
		Shape square = factory.createShape("SQUARE");

		shapes.add(circle);
		shapes.add(square);
		shapes.add(rectangle);

		for(Shape s:shapes) {
			System.out.println(s);
			System.out.println(" area=" + s.area() + " perimeter: " + s.perimeter() + " ");
		}

		// Sorting shapes with strategy pattern
		System.out.println("Sorting shapes");
		factory.getSorting().sort(shapes);
		System.out.println(shapes);
		factory.setSorting(new SortLongestSide());
		factory.getSorting().sort(shapes);
		System.out.println(shapes);
		factory.setSorting(new SortShortestSide());
		factory.getSorting().sort(shapes);
		System.out.println(shapes);
	}
}
