package ProcessAndThread.printNumber;

public class NumberPrinter implements Runnable{
    int i;
    NumberPrinter(int i){
        this.i = i;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(i + " from thread " + threadName);
    }
}
