package fr.cs.oose.pr6;

import java.util.ArrayList;
import java.util.Comparator;

public class SortShortestSide implements SortStrategy {
    @Override
    public void sort(ArrayList<Shape> array) {
        array.sort(Comparator.comparingDouble(Shape::minSide));
    }
}