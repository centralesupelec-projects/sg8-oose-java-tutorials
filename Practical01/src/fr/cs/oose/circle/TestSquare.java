package fr.cs.oose.circle;

public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square(Math.sqrt(2));
        Square s2 = new Square(4);

        Circle c1 = new Circle(1, "red");
        Circle c2 = new Circle(2, "red");

        System.out.println("Square 1 inscribed in Circle 1: " + s1.inscribed(c1));
        System.out.println("Square 1 inscribed in Circle 2: " + s1.inscribed(c2));
        System.out.println("Circle 2 inscribed in Square 2: " + c2.inscribed(s2));
        System.out.println("Circle 1 inscribed in Square 2: " + c1.inscribed(s2));
    }
}
