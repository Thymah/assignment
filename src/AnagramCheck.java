import java.util.Arrays;

public class AnagramCheck {
    public static void CheckIfAnagram(String a, String b){
           char[] s1 = a.toCharArray();
           char[] s2 = b.toCharArray();
           Arrays.sort(s1);
           Arrays.sort(s2);

           if ( a.length() == b.length() && Arrays.equals(s1, s2) ) {
               System.out.println("TRUE! YOUR WORD IS AN ANAGRAM");
           }
           else {
               System.out.println("FALSE! YOUR WORD IS NOT AN ANAGRAM");
           }

    }

    public static void main(String[] args) {
       String fWord = InputCollector.collectInput("pls enter ur first words");
       String sWord = InputCollector.collectInput("pls enter ur second word");
       CheckIfAnagram(fWord , sWord);

    }
}
