package abtraction;

public class Woman extends Human{
    String favouriteHairDo;
    @Override
    void canBath() {
        System.out.println("i bath twice daily");
    }

    @Override
    void leg(int numberOfLegs){
        leg = numberOfLegs;
    }
    public String hairDo(String favouriteHairDo){
        return this.favouriteHairDo = favouriteHairDo;
    }

    @Override
    String display() {
        String display = super.display();
        return  display + " and my Favourite Hair Do" + favouriteHairDo;
    }
}
