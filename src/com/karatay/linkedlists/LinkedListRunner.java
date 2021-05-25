package com.karatay.linkedlists;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println(list.contains(10));
        System.out.println(list.contains(20));
        System.out.println(list.contains(30));
        System.out.println(list.contains(40));
    }
}
