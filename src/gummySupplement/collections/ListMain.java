package gummySupplement.collections;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.set(1, "c");
        list.remove("a");
        System.out.println(list.get(1));
        System.out.println(list.contains("a"));
        System.out.println(list + " size: " + list.size() + "-------");


        Set<String> set = new HashSet<>();

        set.add("ㄱ");
        set.add("ㄴ");
        set.add("ㄷ");

        System.out.println(set + "---------");


        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);

        System.out.println(map.get("first"));
        System.out.println("getOrDefault: " + map.getOrDefault("second", 0));
        System.out.println("map.keySet(): " + map.keySet());
        System.out.println("map.values(): " + map.values());
        System.out.println("map.entrySet()" + map.entrySet());

        System.out.println(map);

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
    }
}
