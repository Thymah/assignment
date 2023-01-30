import java.util.Arrays;

public class SortingAnagram {
    public static void sort(String[] wordList){
        Arrays.sort(wordList);
        System.out.println(wordList);

    }


    public static void main(String[] args) {
        String[] str = new String[]{"rat" , "atr", "hat", "tar", "ate", "eat"};
        sort(str);

    }
}
