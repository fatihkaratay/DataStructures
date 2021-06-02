package com.karatay.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);

        QueueExcercises helper = new QueueExcercises();
        helper.reverse(q);
        System.out.println(q);
    }
}
