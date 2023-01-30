package abtraction;

public abstract class Animal {
    int leg, ear;
    abstract void leg(int numberOfLegs);
    void ear(){
        System.out.println("i have two ears");
    }
    void sound(){
        System.out.println("i can make sound");
    }
    String display (){
       return  "number of legs is " + leg;
    }

      }

