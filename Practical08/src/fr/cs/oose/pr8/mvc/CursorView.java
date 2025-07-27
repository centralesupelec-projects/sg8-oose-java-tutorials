package fr.cs.oose.pr8.mvc;

import java.util.Observable;
import java.util.Observer;

public class CursorView implements Observer {
    private CursorModel cursor;
    public CursorView(CursorModel cursor) {
        super();
        this.cursor = cursor;
        this.cursor.addObserver(this);
    }

    public void viewCursor(CursorModel cursor) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cursor.getPosition()-1; i++) {
            builder.append("|   |");
        }
        builder.append("| + |");
        for (int i = 0; i < 5 - cursor.getPosition(); i++) {
            builder.append("|   |");
        }
        System.out.println("+---++---++---++---++---+");
        System.out.println(builder.toString());
        System.out.println("+---++---++---++---++---+");
    }
    @Override
    public void update(Observable o, Object arg) {
        this.viewCursor(this.cursor);
    }
}
