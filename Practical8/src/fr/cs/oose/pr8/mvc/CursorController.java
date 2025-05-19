package fr.cs.oose.pr8.mvc;

public class CursorController {
    private CursorModel cursor;
    private CursorView view;

    public CursorController(CursorModel cursor, CursorView view) {
        super();
        this.cursor = cursor;
        this.view = view;
    }

    public void changePosition(int position){
        cursor.setPosition(position);
    }

    public void updateView(){
        view.viewCursor(cursor);
    }
}
