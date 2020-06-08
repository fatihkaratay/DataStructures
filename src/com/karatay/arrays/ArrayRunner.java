package com.karatay.arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array number = new Array(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        // number.insert(40);

        // number.removeAt(3);
        // System.out.println("index of" + number.indexOf(2));
        number.print();

    }
}
