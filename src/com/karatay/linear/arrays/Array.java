package com.karatay.linear.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int capacity) {
        items = new int[capacity];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + ", ");
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] new_arr = new int[count * 2];
            for (int i = 0; i < count; i++) {
                new_arr[i] = items[i];
            }
            items = new_arr;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        int max = count > 0 ? items[0] : 0;
        for (int i = 0; i < count; i++)
            max = Math.max(max, items[i]);
        return max;
    }

    public void reverse() {
        for (int i = count-1; i >= 0; i--)
            System.out.print(items[i] + ", ");
    }

    public void insertAt(int index, int item) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        int[] new_arr = new int[items.length + 1];

        for (int i = 0; i < index; i++)
            new_arr[i] = items[i];

        new_arr[index] = item;

        for (int i = index + 1; i <= items.length; i++)
            new_arr[i] = items[i - 1];

        items = new_arr;
    }

}
