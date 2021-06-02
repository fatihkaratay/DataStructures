package com.karatay.queues;

import java.util.Queue;
import java.util.Stack;

public class QueueExcercises {
    // 1-Reverse the queue
    public void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            int current = q.remove();
            stack.push(current);
        }

        while(!stack.empty()) {
            q.add(stack.pop());
        }

    }

}
