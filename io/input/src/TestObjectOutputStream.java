import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("./testDirname/world.txt"));
        Testfileinputstream object = (Testfileinputstream) input.readObject();
        input.close();
    }
}
