import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add(100);
        arrayList.add(99.99);
        arrayList.add(true);
        arrayList.add(1, "测试");

        System.out.println(arrayList);
    }
}
