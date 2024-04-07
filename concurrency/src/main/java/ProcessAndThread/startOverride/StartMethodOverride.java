package ProcessAndThread.startOverride;

class TheChild extends Thread {
//    @Override
//    public synchronized void start() {
//        super.start();
//    }

    @Override
    public synchronized void start() {
        System.out.println("run() method: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run() method: " + Thread.currentThread().getName());
    }
}
public class StartMethodOverride {
    public static void main(String[] args) {
        TheChild theChild = new TheChild();
        theChild.start();
        System.out.println("main method: " + Thread.currentThread().getName());
    }
}
