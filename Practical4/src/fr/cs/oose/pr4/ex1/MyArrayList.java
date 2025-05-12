package fr.cs.oose.pr4.ex1;

import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList() {
        super();
    }

    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    public MyArrayList<E> removeDuplicate() {
        MyArrayList<E> uniqueList = new MyArrayList<E>();
        for (E element : this) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
}
