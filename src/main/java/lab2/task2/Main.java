package lab2.task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        if (args.length < 1) {
            System.out.println("Give me path");
        }
        else {
            FileReader fileReader = new FileReader();
            String hamlet = null;
            try {
                hamlet = fileReader.fileReaderIntoString(args[0]);
                TextData textData = new TextData(hamlet, args[0]);
                System.out.println(textData.toStringPretty(400));
            } catch (IOException e) {

                System.err.println("An error occurred while reading the file: " + e.getMessage());
                e.printStackTrace(); // This prints the stack trace to standard error
            }
        }
    }
}
