package ProcessAndThread.extendingThreadClass;
class TheChild extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0; i <= 200; i++){
            System.out.println("Count: " + i + ", Thread Name: " + Thread.currentThread().getName());
        }
    }
    public void run(int num){
        for(int i = 0; i <= 200; i++){
            System.out.println("Number: " + num + ", Count: " + i + ", Thread Name: " + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        TheChild thread = new TheChild();
        System.out.println(thread.getName());
        thread.start();
        for(int i = 0; i <= 200; i++){
            System.out.println("Count: " + i + ", Thread Name: " + Thread.currentThread().getName());
        }
    }
}
