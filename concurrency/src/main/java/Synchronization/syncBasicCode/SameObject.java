package Synchronization.syncBasicCode;

// Sync concept using same Object (Only 1 display method is used)
public class SameObject {
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
