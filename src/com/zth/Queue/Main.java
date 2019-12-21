package com.zth.Queue;

/**
 * Author: 3zZ.
 * Date: 2019/12/21 5:07 下午
 */
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(11);
        queue.enQueue(22);
        queue.enQueue(33);
        queue.enQueue(44);

        while(!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
    }
}
