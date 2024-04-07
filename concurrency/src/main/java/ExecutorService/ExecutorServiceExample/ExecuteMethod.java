package ExecutorService.ExecutorServiceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Service implements Runnable{
    int i;
    Service(int i){
        this.i = i;
    }
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count: " + i + ", Thread: " + Thread.currentThread().getName());
    }
}

public class ExecuteMethod {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 1; i <= 25; i++){
            es.execute(new Service(i));
        }
        es.shutdown();
    }
}
