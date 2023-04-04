import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream output = new FileOutputStream("output.txt")) {
            byte[] array = "JavaGuide".getBytes();
            output.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
