package abtraction;

public class Goat extends Animal {
    @Override
    void leg(int numberOfLegs) {
        leg = numberOfLegs;
    }

    @Override
    void ear() {
        super.ear();
        System.out.println("and the ears are long");
    }
}
