package com.zth.datastruct.linkedArray;

/**
 * Author: 3zZ.
 * Date: 2019/11/4 7:09 下午
 */
public class LinkedList {
    private int size;
    private int[] elements;
    private LinkedList next;

    public LinkedList(int size, int[] elements, LinkedList next) {
        this.size = size;
        this.elements = elements;
        this.next = next;
    }
}
