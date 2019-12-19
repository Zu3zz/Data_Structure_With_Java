package com.zth.Stack.List;

/**
 * Author: 3zZ.
 * Date: 2019/11/2 8:21 下午
 */
@SuppressWarnings("unchecked")
public class ArrayList<E> extends AbstractList<E> {

    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(int capaticy) {
        capaticy = (capaticy < 0) ? DEFAULT_CAPACITY : capaticy;
        elements = (E[]) new Object[capaticy];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 保证要有capacity的容量
     *
     * @param capacity 保证的容量
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity > capacity) return;
        // 位操作快一些
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
//        System.out.println(oldCapacity + "扩容为" + newCapacity);
    }

    /**
     * 清除所有元素
     */
    public void clear() {
        // 使用泛型之后，存储内存地址，需要将elements里面内容指向清空
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    /**
     * 往index位置中插入一个元素
     *
     * @param index   需要插入的数组位置下标
     * @param element 需要插入的数组元素值
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        ensureCapacity(size + 1);

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        size++;
        elements[index] = element;
    }

    /**
     * 往数组中删除元素
     *
     * @param index 需要删除的元素值下标
     */
    public E remove(int index) {
        rangeCheck(index);
        E ret = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return ret;
    }

    public void remove(E element){
        remove(indexOf(element));
    }


    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size = ").append(size).append(", elements: [");
        for (int i = 0; i < size; i++) {
            if (i != 0) string.append(", ");
            string.append(elements[i]);
        }
        string.append("]");
        return string.toString();
    }
}
