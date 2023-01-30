import java.util.Arrays;

public class PrintArrayPractice {
    static String[] foodStuffs;


    private static void PrintArrayWithForLoop(String[] arraylist) {
        String outPut = "";
        int i;
        for (i = 0; i < arraylist.length; i++) {


            if (i == 0) {
                outPut = outPut.concat("[");
            }
            outPut = outPut.concat(arraylist[i]);


            if (i != arraylist.length - 1) {
                outPut = outPut.concat(", ");
            } else {
                outPut = outPut.concat("]");
            }
        }

           System.out.print(outPut);
       }


    public static void main(String[] args) {
        String foodStuffs[];
        foodStuffs = new String[]  {"Rice", "Beans", "Egg", "Yam"};
        System.out.println(Arrays.toString(foodStuffs));
       PrintArrayWithForLoop(foodStuffs);

    }
}

