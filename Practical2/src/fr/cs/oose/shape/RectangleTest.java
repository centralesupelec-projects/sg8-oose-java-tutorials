package fr.cs.oose.shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(10,20);
        System.out.println(r2);

        Rectangle r3 = new Rectangle(5, 20, "pink", false);
        System.out.println(r3);
    }
}
