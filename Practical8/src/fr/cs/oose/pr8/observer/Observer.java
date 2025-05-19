package fr.cs.oose.pr8.observer;

public interface Observer {
    public void update(String message);
    public void setBoard(MessageBoard board);
}
