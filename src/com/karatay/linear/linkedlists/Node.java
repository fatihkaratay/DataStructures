package com.karatay.linear.linkedlists;

/**
 * This closs is for implementation detail only.
 * Normally, we should not have public attributes here.
 * We can add this class inside the LinkedList class as a inner class.
 * Or add getters/setters there.
 * But for learning purposes, this should be fine.
 */

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
