package com.karatay.stacks;

import java.util.Stack;

public class StackRunner {
    public static void main(String[] args) {
        StackExercises helper = new StackExercises();

        String str0 = null; // Illegal arg exc.
        String str1 = ""; //T
        String str2 = "()";// T
        String str3 = "(]"; //F
        String str4 = "(1 + 2)"; //T
        String str5 = "(1) + (2)"; //T
        String str6 = "{[(1) + (2)]}"; // T
        String str7 = "{[(5s)}"; // F
//        System.out.println(helper.isBalanced(str0));
        System.out.println(helper.isBalanced(str1));
        System.out.println(helper.isBalanced(str2));
        System.out.println(helper.isBalanced(str3));
        System.out.println(helper.isBalanced(str4));
        System.out.println(helper.isBalanced(str5));
        System.out.println(helper.isBalanced(str6));
        System.out.println(helper.isBalanced(str7));

    }
}
