package ProcessAndThread.yieldJoinSleep.yield;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
