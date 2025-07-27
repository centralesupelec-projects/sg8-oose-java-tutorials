package fr.cs.oose.pr8.mvc;

import java.util.Scanner;

public class CursorMVC {
    public static void main(String[] args) {
        CursorModel cursor = new CursorModel(3);
        CursorView view = new CursorView(cursor);
        CursorController controller = new CursorController(cursor, view);
        controller.updateView();

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a command ['q' to go left] ['d' to go right] ['x' to exit] ");
            String inputString = input.nextLine();
            if (inputString.equals("q")) {
                controller.changePosition(cursor.getPosition()-1);
            }
            else if (inputString.equals("d")) {
                controller.changePosition(cursor.getPosition()+1);
            }
            else if (inputString.equals("x")) {
                break;
            }
        } while (true);
    }
}
