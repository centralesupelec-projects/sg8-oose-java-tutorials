package fr.cs.oose.pr10.ex1;

public class TestThreadDemo {
    public static void main(String args[]) {
        // Non synchronisé
        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo("Thread - 1", PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2", PD);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }

        // Synchronisé
        ThreadDemoSynchronized T1_synchro = new ThreadDemoSynchronized("Thread Synchro - 1", PD);
        ThreadDemoSynchronized T2_synchro = new ThreadDemoSynchronized("Thread Synchro - 2", PD);

        T1_synchro.start();
        T2_synchro.start();

        try {
            T1.join();
            T2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
