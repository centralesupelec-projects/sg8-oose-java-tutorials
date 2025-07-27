package fr.cs.oose.pr8.observer;

public class BoardReader implements Observer {

    private String name;
    private String messageOnBoard;
    private MessageBoard board;

    public BoardReader(String name) {
        super();
        this.name = name;
        this.messageOnBoard = "";
    }

    public void setBoard(MessageBoard board) {
        this.board = board;
    }

    public MessageBoard getBoard() {
        return board;
    }

    public void postMessage(String message) {
        board.postMessage(message);
    }

    public void update(String message) {
        this.messageOnBoard = message;
        System.out.println("Reader " + this.name + " has received message [ " + message + " ]");
    }
}
