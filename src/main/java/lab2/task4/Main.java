package lab2.task4;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            TextDataThread textDataThread = new TextDataThread(arg);
            Thread t = new Thread(textDataThread);
            t.start();
        }
    }
}
