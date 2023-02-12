package inputAndOutput.fileIoStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IoPractice {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choice one operation \n1. input details \n2. view details");

            int operation = scanner.nextInt();

        if (operation == 1) {
            try {
                FileOutputStream out = new FileOutputStream("src/fileIoStream/dataStore.txt");
                System.out.println("enter your full name");
                String message = scanner.next();

                System.out.println("enter your occupation");
                String occupation = scanner.next();

                System.out.println("enter your age");
                int age = scanner.nextInt();

                out.write(message.getBytes());
                out.write( occupation.getBytes());
                out.write(age);

            } catch (InputMismatchException e) {
                System.out.println("invalid Input! Try again");
                System.exit(0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if(operation == 2){
            String content = Files.readString(Path.of("src/dataStore.txt"));
            System.out.println(content);

        }else {
            System.out.println("invalid Input! Try again");
            System.exit(0);
        }
}
}
