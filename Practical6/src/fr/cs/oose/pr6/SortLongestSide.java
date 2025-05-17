package fr.cs.oose.pr6;

import java.util.ArrayList;
import java.util.Comparator;

public class SortLongestSide implements SortStrategy {
    @Override
    public void sort(ArrayList<Shape> array) {
        array.sort(Comparator.comparingDouble(Shape::maxSide));
    }
}
