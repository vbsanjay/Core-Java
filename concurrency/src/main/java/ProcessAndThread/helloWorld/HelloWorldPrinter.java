package ProcessAndThread.helloWorld;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++){
            //Thread.currentThread().setName("1st Thread");
            String threadName = Thread.currentThread().getName();
            System.out.println( "Count: " + i + ". Hello World from " + threadName);
        }
    }
}
