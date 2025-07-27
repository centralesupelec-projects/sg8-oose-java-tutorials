package fr.cs.oose.pr10.ex1;

class ThreadDemo extends Thread {
    //private Thread t;
    private String threadName;
    private PrintDemo PD;

    public ThreadDemo(String name, PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        PD.printCount(threadName);
        System.out.println("Thread " + threadName + " exiting.");
    }
}
