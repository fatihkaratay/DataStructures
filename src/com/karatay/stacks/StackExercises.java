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

    public boolean isBalanced(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)){
                if (stack.empty()) return false;
                char top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }
    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }
    private boolean bracketsMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == '>' && left != '<') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{');
    }
}
