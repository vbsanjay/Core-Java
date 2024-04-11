package ProcessAndThread.yieldJoinSleep.join;

public class AnotherThread implements Runnable{

    Thread thread;

    public AnotherThread(){

    }

    public AnotherThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("T2 says Hello: " + Thread.currentThread().getName());
            if (i == 4){
                try {
                    //thread.join(3000);
                    thread.join(3000, 10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
