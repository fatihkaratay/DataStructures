package com.karatay.linkedlists;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(40));
    }
}
