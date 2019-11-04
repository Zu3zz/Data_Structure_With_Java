package com.zth.datastruct.linkedArray;

/**
 * Author: 3zZ.
 * Date: 2019/11/4 7:09 下午
 */
public class LinkedList {
    private int size;
    private int[] elements;

    private static final int INITIAL_SIZE = 10;

    public LinkedList(){
        elements = new int[INITIAL_SIZE];
    }

    private boolean rangeCheck(int index) throws Exception {
        if(index < 0 || index > size){
            throw new Exception("index Out Of Range");
        }else{
            return true;
        }
    }

    public void clear(){
        return;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(int element){
        add(element, size);
    }
    public void add(int element, int index){
        return;
    }

    public int remove(int element){
        return -1;
    }
}
