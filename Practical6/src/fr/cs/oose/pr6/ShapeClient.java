package fr.cs.oose.pr6;

import java.util.Scanner;

public class ShapeClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What shape would you like?:\t");
        String shapeType = scanner.nextLine();
        Shape myShape = shapeFactory.createShape(shapeType);
        System.out.println(myShape.area());
    }
}
