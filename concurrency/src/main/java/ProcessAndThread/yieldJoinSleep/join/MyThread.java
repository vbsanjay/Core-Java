package ProcessAndThread.yieldJoinSleep.join;

public class MyThread implements Runnable{

    Thread thread;

    public MyThread(){

    }

    public MyThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("T1 says Hello: " + Thread.currentThread().getName());
            try {
                //Thread.sleep(1000, 1000000); this will throw java.lang.IllegalArgumentException, nanosecond timeout value out of range
                //1000000 nano seconds = 1 millisecond, so nanosecond value should be lesser than 1000000
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
