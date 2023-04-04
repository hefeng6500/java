import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

            byte[] array = "JavaGuide".getBytes();
            bos.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
