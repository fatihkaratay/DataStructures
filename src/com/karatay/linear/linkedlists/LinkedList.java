package com.karatay.linear.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first; // head node
    private Node last; // tail node

    private int size = 0;

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
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
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            Node previousNode = getPreviousNode(last);
            last = previousNode;
            last.next = null;
        }

        size--;
    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) {
                return node;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        int index = 0;
        Node currentNode = first;

        while (currentNode != null) {
            arr[index++] = first.value;
            currentNode = currentNode.next;
        }

        return arr;
    }

    public void reverse() {
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    // Finding the kth node from the end of a linked list in one pass
    // assume that we do not know the size
    public int getKthFromEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        Node a = first;
        Node b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }

        while (b != null) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    /*
     Find the middle of a linked list in one pass.
     If the list has an even number of nodes, there would be two middle nodes.
     (Note: Assume that you don’t know the size of the list ahead of time.)
    */
    public void printMiddle() {
        if (first == null)
            throw new IllegalStateException();

        Node a = first;
        Node b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last) {                    // if odd numbers of nodes
            System.out.println(a.value);
        } else {                            // if even numbers of nodes
            System.out.println(a.value + " and " + a.next.value);
        }
    }

    /*
    Check to see if a linked list has a loop
    */
    public boolean hasCycle() {
        if (first == null) {
            return false;
        }

        Node fast = first.next;
        Node slow = first;
        while (fast != null && fast.next != null && slow != null) {
            if (fast.value == slow.value) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }

    /*
    Adding a node to the specific position
    */
    public void insertNodeAtPosition(int position, Node node) {
        if (first == null) {
            return;
        }

        Node pointer = first;
        for (int i = 1; i <= position; i++) {
            pointer = pointer.next;
        }

        node.next = pointer.next;
        pointer = node;
    }


    // helper methods
    private boolean isEmpty() {
        return first == null;
    }
}
