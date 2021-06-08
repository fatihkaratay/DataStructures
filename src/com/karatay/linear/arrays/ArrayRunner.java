package com.karatay.linear.arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);

        numbers.print();
        System.out.println();
        numbers.insertAt(1, 20);
        numbers.print();
    }
}
