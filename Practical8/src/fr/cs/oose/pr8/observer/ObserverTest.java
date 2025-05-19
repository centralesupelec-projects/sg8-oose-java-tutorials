package fr.cs.oose.pr8.observer;

public class ObserverTest {
    public static void main(String[] args) {
        MessageBoard bbs_board = new MessageBoard();
        // Creating the two observers
        BoardReader reader1 = new BoardReader("reader1");
        BoardReader reader2 = new BoardReader("reader2");
        // Registering the observers
        bbs_board.registerObserver(reader1);
        bbs_board.registerObserver(reader2);
        // Posting messages on the board
        bbs_board.postMessage("Hello World");
        bbs_board.postMessage("This is a test message on the board");

        reader1.postMessage("Hello World from reader1");
    }
}
