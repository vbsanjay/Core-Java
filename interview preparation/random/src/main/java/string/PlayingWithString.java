package string;

private class hello{

}

public class PlayingWithString {
    public static void main(String[] args) {
        String name = "Sanjay";
        String name1 = new String("Sanjay");
        String name2 = "Sanjay";

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println("----------------------");
        name2 = "Vijay";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }
}
