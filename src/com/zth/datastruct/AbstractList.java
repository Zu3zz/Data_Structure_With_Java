package com.zth.datastruct;

/**
 * Author: 3zZ.
 * Date: 2019/11/6 12:43 上午
 */
public abstract class AbstractList<E> implements List<E> {

    protected int size;

    /**
     * 返回数组大小
     */
    public int size() {
        return size;
    }

    /**
     * 返回数组是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 往数组中添加元素
     *
     * @param element 是否包含此元素
     */
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }


    /**
     * 往数组尾部添加元素
     *
     * @param element 需要插入的元素值
     */
    public void add(E element) {
        add(size, element);
    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index out of range, index is " + index);
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            System.out.println(size);
            outOfBounds(index);
        }
    }

}
