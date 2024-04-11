package ProcessAndThread.yieldJoinSleep.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        AnotherThread anotherThread = new AnotherThread(t1);
        t1.start();
        Thread t2 = new Thread(anotherThread);
        for (int i = 0; i < 10; i++) {
//            if(i == 8){
//                t1.join();
//            }
            System.out.println("Main says Hello: " + Thread.currentThread().getName());
        }
        t2.start();

    }
}
