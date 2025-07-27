package fr.cs.oose.pr10.ex4;

import java.awt.print.PrinterJob;
import java.util.ArrayList;

public class DiningPhilosophers {
    private int N;
    private int minThinkTime;
    private int maxThinkTime;
    private int minEatTime;
    private int maxEatTime;
    private ArrayList<Philosopher> philosophers = new ArrayList<>();
    private ArrayList<Chopstick> chopsticks = new ArrayList<>();

    public DiningPhilosophers(int N, int minThinkTime, int maxThinkTime, int minEatTime, int maxEatTime) {
        this.N = N;
        this.minThinkTime = minThinkTime;
        this.maxThinkTime = maxThinkTime;
        this.minEatTime = minEatTime;
        this.maxEatTime = maxEatTime;

        for (int i = 0; i < N; i++) {
            chopsticks.add(new Chopstick(i));
        }
        for (int i = 0; i < N-1; i++) {
            philosophers.add(new Philosopher(i, "P" + i, chopsticks.get(i), chopsticks.get(i+1), this));
        }
        philosophers.add(new Philosopher(N-1, "P" + (N-1), chopsticks.get(N-1), chopsticks.get(0), this));
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getMinThinkTime() {
        return minThinkTime;
    }

    public void setMinThinkTime(int minThinkTime) {
        this.minThinkTime = minThinkTime;
    }

    public int getMaxThinkTime() {
        return maxThinkTime;
    }

    public void setMaxThinkTime(int maxThinkTime) {
        this.maxThinkTime = maxThinkTime;
    }

    public int getMinEatTime() {
        return minEatTime;
    }

    public void setMinEatTime(int minEatTime) {
        this.minEatTime = minEatTime;
    }

    public int getMaxEatTime() {
        return maxEatTime;
    }

    public void setMaxEatTime(int maxEatTime) {
        this.maxEatTime = maxEatTime;
    }

    public ArrayList<Philosopher> getPhilosophers() {
        return philosophers;
    }

    public ArrayList<Chopstick> getChopsticks() {
        return chopsticks;
    }
}
