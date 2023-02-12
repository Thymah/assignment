package inputAndOutput.bufferedIoStream;

public class Animal {
    String animalType;
     String petName;
     String favFood;
    int age;

    public Animal(String animalType, String petName, String favFood, int age) {
        this.animalType = animalType;
        this.petName = petName;
        this.favFood = favFood;
        this.age = age;
    }

    public byte[] getByte() {
        return (animalType + "," + petName + "," + favFood + "," + age).getBytes();

    }
}
