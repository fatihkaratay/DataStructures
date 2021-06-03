package com.karatay.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {
        String str = "green apple"; // should return 'l'

        HashMapExcercises helper = new HashMapExcercises();
        char nonRepeated = helper.getFirstNonRepeated(str);
        char repeated = helper.getFirstRepeated(str);
        System.out.println(nonRepeated);
        System.out.println(repeated);
    }
}
