import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // 创建文件
        File file = new File("test.txt");
        file.createNewFile();
        file.delete();

//        创建文件夹
        File file1 = new File("dirname");
        file1.mkdir();
        file1.delete();

        File dir = new File("testDirname");
        dir.mkdir();

        File newFile = new File("./testDirname/hello.txt");
        File newFile1 = new File("./testDirname/world.txt");

        newFile.createNewFile();
        newFile1.createNewFile();

        String[] fileList = dir.list();

        System.out.println(fileList.length);

//        遍历文件夹下的文件
        File[] files = dir.listFiles();

        for (File fileItem : files) {
            System.out.println(fileItem.getName());
        }

//        重命名
        File newFile2 = new File("./testDirname/newname.txt");
        newFile.renameTo(newFile2);

        File[] files2 = dir.listFiles();
        for (File fileItem : files2) {
            System.out.println(fileItem.getName());
        }

    }
}