package com.karatay.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {
        String str = ""; // should return 'l'

        HashMapExcercises helper = new HashMapExcercises();
        char value = helper.getFirstNonRepeated(str);
        System.out.println(value);
    }
}
