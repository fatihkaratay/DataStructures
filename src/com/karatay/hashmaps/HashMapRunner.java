package com.karatay.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        System.out.println(map);

        for (int item: map.keySet()) {
            System.out.print(item + " ");
        }
        for ( Map.Entry item : map.entrySet()) {
            System.out.println(item);
        }
    }
}
