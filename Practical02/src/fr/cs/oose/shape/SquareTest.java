package fr.cs.oose.shape;

public class SquareTest {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1);

        Square s2 = new Square(10);
        System.out.println(s2);

        Square s3 = new Square(30, "blue", false);
        System.out.println(s3);

        s1.setWidth(100);
        System.out.println(s1);

        s2.setLength(5);
        System.out.println(s2);

        System.out.println("Computing Areas and Perimeters");
        System.out.println(s3.getArea());
        System.out.println(s2.getArea());
        System.out.println(s1.getPerimeter());

    }
}
