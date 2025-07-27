package fr.cs.oose.pr8.observer;

import java.util.ArrayList;

public class MessageBoard implements Observable {

    private String message;
    private boolean changed;
    private ArrayList<Observer> observers;

    public MessageBoard() {
        super();
        this.message = "";
        this.changed = false;
        this.observers = new ArrayList<Observer>();
    }

    public MessageBoard(String message) {
        super();
        this.message = message;
        this.changed = false;
        this.observers = new ArrayList<Observer>();
    }

    public MessageBoard(String message, ArrayList<Observer> observers) {
        super();
        this.message = message;
        this.changed = false;
        this.observers = observers;
    }

    public void postMessage(String message) {
        this.message = message;
        this.changed = true;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        observer.setBoard(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        observer.setBoard(null);
    }

    @Override
    public void notifyObservers() {
        if (this.changed) {
            for (Observer ob : observers)
                ob.update(this.message);
            this.changed= false;
        }
    }
}
