import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("input.txt");) {
            int content;
            long skip = fileReader.skip(3);
            System.out.println("The actual number of bytes skipped:" + skip);
            System.out.print("The content read from file:");
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
