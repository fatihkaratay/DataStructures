package com.karatay.linear.linkedlists;

import java.util.Arrays;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
