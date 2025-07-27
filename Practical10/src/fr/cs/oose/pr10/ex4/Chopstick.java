package fr.cs.oose.pr10.ex4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private int position;
    private Lock lock = new ReentrantLock();

    public Chopstick(int position) {
        this.position = position;
    }

    public void pick_up() {
        lock.lock();
        System.out.println("Chopstick " + position + " picked up");
    }

    public void put_down() {
        lock.unlock();
        System.out.println("Chopstick " + position + " put down");
    }
}
