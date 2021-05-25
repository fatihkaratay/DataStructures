package com.karatay.linkedlists;

public class LinkedList {
    private Node first; // head node
    private Node last; // tail node

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
    // size
}
