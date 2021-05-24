package com.karatay.arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.print();

        System.out.println();

        numbers.removeAt(1);
        numbers.print();

        System.out.println();

        System.out.println(numbers.indexOf(50));
    }
}
