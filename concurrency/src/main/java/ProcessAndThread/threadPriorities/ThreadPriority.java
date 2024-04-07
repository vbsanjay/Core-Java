package ProcessAndThread.threadPriorities;

class MyThread implements Runnable{
    String x;
    MyThread(String x){
        this.x = x;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(10);
        for(int i = 0; i < 10; i++)
            System.out.println(x + " Thread name: " + Thread.currentThread().getName() +
                    " Priority: " + Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getPriority());
    }
}
class ThreadPriority {

    Thread thread1 = new Thread();

    public static void main(String[] args) {
        MyThread myThread01 = new MyThread("Runnable 1");
        MyThread myThread02 = new MyThread("Runnable 2");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // the child threads inherit their priorities from the main thread at the time of their creation.
        Thread thread1 = new Thread(myThread01);
        Thread thread2 = new Thread(myThread02);
        Thread.currentThread().setPriority(1); //Inheritance does not happen here.
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
        thread1.start();
        thread2.start();
        for(int i = 0; i < 10; i++)
            System.out.println("Main:" + " Priority: " + Thread.currentThread().getPriority());
    }
}

