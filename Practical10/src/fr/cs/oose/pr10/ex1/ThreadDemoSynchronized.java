package fr.cs.oose.pr10.ex1;

class ThreadDemoSynchronized extends Thread {
    //private Thread t;
    private String threadName;
    private PrintDemo PD;

    public ThreadDemoSynchronized(String name, PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        synchronized (PD) {
            PD.printCount(threadName);
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
