package lab2.task2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileReader {

    public String fileReaderIntoString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
