package abtraction;

public class AbractionClassRunner {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.leg(4);
        goat.sound();
        goat.ear();
        System.out.println(goat.display());
        System.out.println("===================");
        Woman woman = new Woman();
        woman.leg(2);
        woman.sound();
        woman.canBath();
        woman.ear();
        woman.hairDo("shuku");
        System.out.println(woman.display());
        System.out.println("=================");
        Bird bird = new Bird();
        bird.displayMethod();

    }
}
