package Synchronization.syncBasicCode;

class Display{
    public synchronized void wish(String name){ // try removing synchronized keyword and check how code works
        for (int i = 0; i < 10; i++){
            System.out.print("Good Morning: ");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Virat");
        MyThread t3 = new MyThread(d, "Pandaya");
        MyThread t4 = new MyThread(d, "Dube");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
