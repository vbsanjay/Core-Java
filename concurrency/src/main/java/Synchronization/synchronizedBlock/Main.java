package Synchronization.synchronizedBlock;
class Display{
    String name;
    public Display(String name){
        this.name = name;
    }
    public void printGoodMorning(){
        //synchronized (this){
        synchronized (Display.class){
            for(int i = 0; i < 10; i++){
                System.out.print("Good Morning: ");
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){

                }
                System.out.println(name);
            }
        }
    }
}

class MyThread extends Thread{
    Display display;
    public MyThread(Display display){
        this.display = display;
    }

    @Override
    public void run() {
        display.printGoodMorning();
    }
}

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display("Sanjay");
        Display d2 = new Display("Vijay");
        MyThread t1 = new MyThread(d1);
        MyThread t2 = new MyThread(d2);
        t1.start();
        t2.start();
    }
}
