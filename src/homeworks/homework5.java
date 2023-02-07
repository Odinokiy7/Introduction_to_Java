package homeworks;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class homework5 {
    public static void main(String[] args) {

        Random random = new Random();

        long hashTimeStart = System.currentTimeMillis();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Белый");
        hashMap.put(2, "Чёрный");
        hashMap.put(3, "Синий");
        hashMap.putIfAbsent(4, "Зелёный");
        System.out.println(hashMap);

        for (var item : hashMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue().concat("!"));
        }

        for (int i = 0; i < 1000; i++) {
            hashMap.put(random.nextInt(1000) + 5, "HashMap");
        }
//        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

        long hashTimeEnd = System.currentTimeMillis();

        long treeTimeStart = System.currentTimeMillis();

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Белый");
        treeMap.put(2, "Чёрный");
        treeMap.put(3, "Синий");
        treeMap.putIfAbsent(4, "Зелёный");
        System.out.println(treeMap);

        for (int i = 0; i < 1000; i++) {
            treeMap.put(random.nextInt(1000) + 5, "TreeMap");
        }
//        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        long treeTimeEnd = System.currentTimeMillis();

        System.out.println("Hash time: " + (hashTimeEnd - hashTimeStart));
        System.out.println("Tree time: " + (treeTimeEnd - treeTimeStart));
    }
}
