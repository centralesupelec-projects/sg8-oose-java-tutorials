package fr.cs.oose.pr4.ex1;

import java.util.Arrays;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>(
                Arrays.asList(2, 2, 2, 2, 5, 5, 8, 9, 9, 2, 9, 8, 4, 1)
        );
        System.out.println(list);
        System.out.println(list.removeDuplicate());
    }
}
