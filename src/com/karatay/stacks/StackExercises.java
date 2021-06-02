package com.karatay.stacks;

import java.util.Stack;

public class StackExercises {
    // 1- reverse a string
    public String reverse(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
