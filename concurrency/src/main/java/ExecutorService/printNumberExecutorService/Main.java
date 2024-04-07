package ExecutorService.printNumberExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        ExecutorService es2 = Executors.newFixedThreadPool(10);
        System.out.println(Thread.currentThread().getName());
        for(int i = 1; i <= 100; i++){
            if (i == 80) {
                System.out.println("STOP");
            }
            es.execute(new NumberPrinter(i));
//            if(i >= 'A' && i <= 'Z'){
//                es2.execute(new AlphabetPrinter((char)i));
//            }
        }
    }
}
