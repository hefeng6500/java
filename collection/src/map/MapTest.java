package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        Map<String, Integer> map = new HashMap<>();

        // 添加键值对
        map.put("apple", 100);
        map.put("banana", 200);
        map.put("orange", 300);

        // 输出Map中的所有键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 判断Map中是否包含某个键
        if (map.containsKey("apple")) {
            System.out.println("Map contains key apple.");
        }

        // 删除Map中的某个键值对
        map.remove("orange");

        // 输出Map中剩余的键值对
        System.out.println("After remove:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 获取Map中元素的个数
        System.out.println("Map size: " + map.size());
    }
}
