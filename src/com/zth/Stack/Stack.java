package com.zth.Stack;

import com.zth.Stack.List.ArrayList;
import com.zth.Stack.List.List;

/**
 * 使用组合 不适用继承 可以更好的封装
 * Author: 3zZ.
 * Date: 2019/12/20 12:36 上午
 */
public class Stack<E>{
    private List<E> list = new ArrayList<>();

    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E top() {
        return list.get(list.size() - 1);
    }
}
