import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World!");
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());

        arrayList.remove(0);
        System.out.println(arrayList);

        String s = "你好！";

        arrayList.add(s);
        System.out.println(arrayList);
        arrayList.remove(s);
        System.out.println(arrayList);
        arrayList.set(0, "test");

        System.out.println(arrayList);
    }
}
