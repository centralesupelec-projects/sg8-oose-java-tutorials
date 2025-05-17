package fr.cs.oose.pr6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() throws BadShapeCreationException {
        assertEquals(8, new Rectangle(new Point(0,0), 2, 4).area());
    }

    @Test
    void perimeter() throws BadShapeCreationException {
        assertEquals(12, new Rectangle(new Point(0,0), 2, 4).perimeter());
    }
}