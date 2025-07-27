package fr.cs.oose.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, "red");
        Circle c2 = new Circle(2, "red");
        Circle c3 = new Circle(8.3, "yellow");

        System.out.println("Circle 1: " + c1.toString());
        System.out.println("Circle 1 radius is: " + c1.getRadius());
        System.out.println("Circle 1 area is: " + c1.getArea());

        System.out.println("Circle 2: " + c2.toString());
        System.out.println("Circle 2 radius is: " + c2.getRadius());
        System.out.println("Circle 2 area is: " + c2.getArea());

        System.out.println("Circle 3: " + c3.toString());
        System.out.println("Circle 3 radius is: " + c3.getRadius());
        System.out.println("Circle 3 area is: " + c3.getArea());
    }
}
