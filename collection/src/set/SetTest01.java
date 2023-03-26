package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest01 {
    public static void main(String[] args) {
        // 创建一个TreeSet对象
        SortedSet<Integer> set = new TreeSet<>();

        // 添加元素
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(6);

        // 输出Set中的元素
        for (Integer i : set) {
            System.out.println(i);
        }

        // 获取Set中第一个元素和最后一个元素
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 获取小于5的元素
        SortedSet<Integer> subset = set.headSet(5);
        System.out.println("Elements less than 5: " + subset);

        // 获取大于等于5的元素
        SortedSet<Integer> tailset = set.tailSet(5);
        System.out.println("Elements greater than or equal to 5: " + tailset);
    }
}
