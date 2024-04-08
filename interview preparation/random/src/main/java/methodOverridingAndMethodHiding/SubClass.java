package methodOverridingAndMethodHiding;

public class SubClass extends SuperClass{
    @Override
    public void helloWorld(){
        System.out.println("Hello World! from subClass");
    }

    public static void test(){
        System.out.println("static method in subclass");
    }
}
