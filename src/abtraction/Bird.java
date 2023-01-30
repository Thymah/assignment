package abtraction;

public class Bird extends Animal {
    @Override
    void leg(int numberOfLegs) {
        leg = numberOfLegs;
    }
    void displayMethod(){
        System.out.println("I have two legs with claws");

    }
}
