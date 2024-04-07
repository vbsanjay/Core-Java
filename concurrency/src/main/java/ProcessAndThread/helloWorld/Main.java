package ProcessAndThread.helloWorld;

public class Main {
    public static void main(String[] args) {
        Runnable hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp, "1st Thread");
        thread.start();
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i <= 200; i++){
            System.out.println( "Count: " + i + ". Hello World from " + threadName);
        }
    }
}
