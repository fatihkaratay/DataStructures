package com.karatay.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapExcercises {
    // 1-Find first non repeated character.
    public char getFirstNonRepeated(String str) {
        if (str == null || str.length() == 0) throw new IllegalArgumentException();

        str = formatStr(str);
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (char ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }

    private String formatStr(String str) {
        String[] tempStr = str.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String item : tempStr)
            sb.append(item);

        return sb.toString();
    }
}


