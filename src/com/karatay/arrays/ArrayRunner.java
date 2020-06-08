package com.karatay.arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array items = new Array(3);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);

        // number.removeAt(3);
        // System.out.println("index of" + number.indexOf(2));
        items.print();

    }
}
