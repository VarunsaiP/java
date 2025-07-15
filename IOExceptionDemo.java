import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}