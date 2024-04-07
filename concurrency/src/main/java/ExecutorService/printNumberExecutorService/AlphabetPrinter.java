package ExecutorService.printNumberExecutorService;

public class AlphabetPrinter implements Runnable{
    char x;
    public AlphabetPrinter(char x){
        this.x = x;
    }
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Char: " + x + " " + threadName);
    }
}
