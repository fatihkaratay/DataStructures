package com.karatay.arrays;

public class Array {
    private int size = 0;
    private int[] items;

    public Array(int size) {
        items = new int[size];
    }

    public void insert(int item) {
        items[size++] = item;
        if (items.length == size) {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++)
                temp[i] = items[i];
            items = temp;
        }
    }

    public void removeAt(int index) {

    }

    public int indexOf(int index) {
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(items[i]);
    }
}
