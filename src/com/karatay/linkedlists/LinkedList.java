package com.karatay.linkedlists;

import java.util.NoSuchElementException;

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

    public int indexOf(int item) {
        int index = 0;
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.value == item) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public  boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
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
