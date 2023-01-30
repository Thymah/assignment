import java.util.Scanner;

public class InputCollector {

    static Scanner scanner = new Scanner(System.in);

    public static String collectInput(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
