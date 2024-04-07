package ProcessAndThread.runMethod;

class MyThread1 extends Thread {

}

/*
If you don't override the run() method in your MyThread1 class,
the empty implementation of the run() method from the Thread class
will be executed implicitly when you call start().
 */

public class RunOverride {
    public static void main(String[] args) {
        MyThread1 mythread1 = new MyThread1();
        mythread1.start();
    }
}
