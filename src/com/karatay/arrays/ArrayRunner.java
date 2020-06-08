package com.karatay.arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array items = new Array(3);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);

        items.print();
        items.removeAt(2);
        items.print();
        System.out.println("index of 40: " + items.indexOf(40));

    }
}
