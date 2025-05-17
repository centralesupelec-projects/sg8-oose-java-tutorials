package fr.cs.oose.pr6;

public class ShapeFactory {
    private SortStrategy sort;

    public ShapeFactory() {
        this.sort = new SortLargerArea();
    }

    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        try {
            Point origin = new Point(0, 0);
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle(origin, 2.5);
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle(origin, 1, 10);
            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square(origin, 6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public SortStrategy getSorting() {
        return sort;
    }
    public void setSorting(SortStrategy sort) {
        this.sort = sort;
    }
}
