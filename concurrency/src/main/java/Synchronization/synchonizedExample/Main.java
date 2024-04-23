package Synchronization.synchonizedExample;

class Display {
    public synchronized void printNumber(){
        for (int i = 1; i <= 26; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i);
        }
    }
    public synchronized void printCharacter(){
        for(int i = 'a'; i <= 'z'; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char)i);
        }
    }
}

class MyThread1 extends Thread{
    Display display;
    MyThread1(Display display){
        this.display = display;
    }
    @Override
    public void run() {
        display.printNumber();
    }
}

class MyThread2 extends Thread{
    Display display;
    MyThread2(Display display){
        this.display = display;
    }
    @Override
    public void run() {
        display.printCharacter();
    }
}

public class Main{
    public static void main(String[] args) {
        Display display = new Display();
        MyThread1 myThread1 = new MyThread1(display);
        MyThread2 myThread2 = new MyThread2(display);
        myThread1.start();
        myThread2.start();
    }
}

