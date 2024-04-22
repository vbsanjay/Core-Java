package Synchronization.syncBasicCode;

public class Display{

    //public static synchronized void wish(String name){ //Static synchronized method acquire lock at class level (i.e. get lock on class object)
    public synchronized void wish(String name){ // try removing synchronized keyword and check how code works
        // if we declare wish method as not synchronized then both threads will be executed simultaneously and hence we will get irregular output.
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