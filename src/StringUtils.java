public class StringUtils {

    public static boolean equal(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            System.out.println("Your words are equal");
            return true;
        } else {
            System.out.println("Your words are not equal");
        }
        return false;
    }

    public static void equalNoReturn(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            System.out.println("Your words are equal");
        } else {
            System.out.println("Your words are not equal");
        }
    }

    public static boolean contains(String firstWord, String secondWord) {
        if (firstWord.contains(secondWord)) {
            System.out.println("Your second word is in the first word and the word left " + "after " + "removing the second word is " + firstWord.replace(secondWord, "".toUpperCase()));
            return true;
        } else {
            System.out.println(" your second word is not in the first word. Your word is still " + firstWord);
        }
        return false;
    }

    public static int countWord(String statement) {
        int wordCount = 0;
        boolean word = false;
        int endOfLine = statement.length() - 1;

        for (int i = 0; i < statement.length(); i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(statement.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(statement.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(statement.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }



    }


