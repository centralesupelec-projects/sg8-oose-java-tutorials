package fr.cs.oose.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("yellow", false);
        System.out.println(s2);
    }
}
