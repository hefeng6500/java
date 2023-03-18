import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("world");
//        arrayList.add(1); 编译时报错


        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<int> arrayList1 = new ArrayList<>(); 编译时报错

        arrayList1.add(12);
    }
}
