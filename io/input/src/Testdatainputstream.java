import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Testdatainputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./testDirname/world.txt");
//必须将fileInputStream作为构造参数才能使用
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//可以读取任意具体的类型数据
//        dataInputStream.readBoolean();
//        dataInputStream.readInt();
//        dataInputStream.readUTF();
        System.out.println(dataInputStream.readUTF());;
    }
}
