package ProcessAndThread.runMethod;

class MyThread implements Runnable {
    @Override
    public void run(){
        System.out.println("Default run executed.");
    }

    public void run(String message){
        System.out.println("Overloaded run executed." + " Message: " + message);
    }
}


public class RunOverload {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread thread = new Thread(mythread);
        thread.start();
        /*
        Overloading the run() method in Java threads is feasible;
        however, the start() method of the Thread class inherently
        invokes the no-argument run() method.
         */
        mythread.run("Hello Worlds!");

    }
}
