public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s =  InputCollector.collectInput("please enter your user Name");


        User user = new User(s);
    }
}