import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Testfileinputstream {
    public static void main(String[] args) throws IOException {
        // 新建一个 BufferedInputStream 对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./testDirname/world.txt"));
        // 读取文件的内容并复制到 String 对象中
        String result = new String(bufferedInputStream.readAllBytes());
        System.out.println(result);
    }
}
