package fr.cs.oose.pr10.ex1;

class PrintDemo {
    public void printCount(String threadName){
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(threadName + " Counter --- "  + i );
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}
