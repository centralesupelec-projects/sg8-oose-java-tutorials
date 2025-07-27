package fr.cs.oose.shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(5);
        System.out.println(c2);

        Circle c3 = new Circle(10, "blue", false);
        System.out.println(c3);
    }
}
