package ProcessAndThread.printNumber;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
