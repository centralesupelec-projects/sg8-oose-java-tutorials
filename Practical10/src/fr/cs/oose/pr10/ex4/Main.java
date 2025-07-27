package fr.cs.oose.pr10.ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DiningPhilosophers diningPhilosophers = new DiningPhilosophers(
                5, 10, 15, 5, 10
        );
        ArrayList<Philosopher> philosophers = diningPhilosophers.getPhilosophers();
        for (Philosopher philosopher: philosophers) {
            philosopher.start();
        }
    }
}
