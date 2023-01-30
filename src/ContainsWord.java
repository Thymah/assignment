import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args) {
        String firstWord,secondWord, firstName, secondName, fullName;

        firstName = InputCollector.collectInput("please enter your firstName");
        secondName = InputCollector.collectInput("please enter your secondName");

        User user = new User(firstName, secondName);

        System.out.println("welcome" + " " + User.getFullName());

        firstWord = InputCollector.collectInput("enter your first word");
        secondWord = InputCollector.collectInput("enter your second word");

        //System.out.println(firstWord.contains(secondWord));
//        boolean containInMethod = new ContainInMethod().contains(firstWord, secondWord);
        boolean containInMethod = StringUtils.contains(firstWord, secondWord);
    }
}
