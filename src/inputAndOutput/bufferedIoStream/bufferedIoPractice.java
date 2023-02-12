package inputAndOutput.bufferedIoStream;


import static inputAndOutput.bufferedIoStream.Utils.*;

public class bufferedIoPractice {
    public static void main(String[] args) {
        entryMessage();
        int ops = collectIntegerInput("choice one operation \n1. Enter pet details \n2. view pet details \n3. exist ");
        while (ops != 3) {
            if (ops == 1) {
                Animal animal = createPetFromDetails();
                savePetDetails(animal);
            } else {
                readPetDetails();
                //if (petDetails != null) {
                //System.out.println(petDetails);
                // Animal animal = createPetArrayFromDetails(petDetails);
                //  System.out.println("=============");
                // System.out.println(animal);
            }

            ops = collectIntegerInput("choice one operation \n1. Enter pet details \n2. view pet details \n3. exist ");
        }
    }

        }
