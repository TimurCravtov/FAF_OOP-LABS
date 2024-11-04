package lab2.task4;

import lab2.task2.FileReader;
import lab2.task2.TextData;

import java.io.IOException;

public class TextDataThread implements Runnable {

    String path;
    TextDataThread(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        FileReader fileReader = new FileReader();
        try {
            String rawTextData = fileReader.fileReaderIntoString(path);
            TextData textData = new TextData(rawTextData, path);
            System.out.println(textData.toStringPretty(100));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
