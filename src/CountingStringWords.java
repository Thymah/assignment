import java.util.Scanner;

public class CountingStringWords {
    public static void main(String[] args) {
        String statement, firstName, secondName, fullName;
 
        Scanner scanner = new Scanner(System.in);

        firstName = InputCollector.collectInput("please enter your first name");
        secondName = InputCollector.collectInput("please enter your secondName");


        User user = new User(firstName, secondName);

        System.out.println("WELCOME" + " " + User.getFullName());

        System.out.println("enter your statement nd we will provide you the number of words in it");
        statement =scanner.nextLine(); // My father is coming ==> 4

        int counter = StringUtils.countWord(statement);
        System.out.println("The length of the word provided is " + counter);

    }
}
