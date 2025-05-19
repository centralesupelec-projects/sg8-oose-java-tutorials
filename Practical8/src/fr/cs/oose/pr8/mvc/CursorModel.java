package fr.cs.oose.pr8.mvc;

import java.util.Observable;

public class CursorModel extends Observable {
    private int position;

    public CursorModel(int position) {
        super();
        this.position = position;
    }

    public int getPosition() { return position; }

    public void setPosition(int position) {
        if (position > 0 && position <= 5) {
            this.position = position;
        }
        this.setChanged();
        this.notifyObservers(position);
    }
}
