package fr.cs.oose.pr10.ex4;

import java.util.Random;

public class Philosopher extends Thread {
    private String name;
    private int position;
    private Chopstick left_chopstick;
    private Chopstick right_chopstick;
    private DiningPhilosophers dining;
    private Random rand = new Random();

    public Philosopher(int position, String name, Chopstick left_chopstick, Chopstick right_chopstick, DiningPhilosophers dining) {
        this.position = position;
        this.name = name;
        this.left_chopstick = left_chopstick;
        this.right_chopstick = right_chopstick;
        this.dining = dining;
    }

    public void think() {
        int randomThink = rand.nextInt(
                dining.getMaxThinkTime() - dining.getMinThinkTime() + 1) + dining.getMinThinkTime();
        try {
            sleep(randomThink * 1000L);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void eat() {
        int randomEat = rand.nextInt(
                dining.getMaxEatTime() - dining.getMinEatTime() + 1) + dining.getMinEatTime();
        left_chopstick.pick_up();
        right_chopstick.pick_up();
        System.out.println("Philosopher [" + name + "|" + position + "] starts eating");
        try {
            sleep(randomEat * 1000L);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Philosopher [" + name + "|" + position + "] ends eating");
        left_chopstick.put_down();
        right_chopstick.put_down();
    }

    public void run() {
        while (true) {
            System.out.println("Philosopher [" + name + "|" + position + "] starts thinking");
            this.think();
            System.out.println("Philosopher [" + name + "|" + position + "] ends thinking");
            this.eat();
        }
    }
}
