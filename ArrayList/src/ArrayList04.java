import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(98);
        arrayList.add(77);
        arrayList.add(66);
        arrayList.add(89);
        arrayList.add(79);
        arrayList.add(50);
        arrayList.add(100);

        System.out.println(arrayList);

//        for (int i = 0; i < arrayList.size(); i++) {
//            int score = arrayList.get(i);
//            if(score < 80) {
//                arrayList.remove(i);
//                i--;
//            }
//        }

//        因为从后往前遍历，remove 元素不会导致元素往前推移
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int score = arrayList.get(i);
            if(score < 80) {
                arrayList.remove(i);
            }
        }

        System.out.println(arrayList);
    }
}
