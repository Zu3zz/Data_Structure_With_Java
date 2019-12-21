package com.zth.Queue;

import com.zth.Queue.list.LinkedList;
import com.zth.Queue.list.List;

/**
 * Author: 3zZ.
 * Date: 2019/12/21 5:07 下午
 */
public class Queue<E> {
    private List<E> list = new LinkedList<>();
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enQueue(E element){
        list.add(element);
    }
    public E deQueue(){
        return list.remove(0);
    }
    public E front(){
        return list.get(0);
    }
    public void clear(){
        list.clear();
    }
}
