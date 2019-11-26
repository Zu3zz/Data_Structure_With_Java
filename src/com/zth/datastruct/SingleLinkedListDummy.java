package com.zth.datastruct;

/**
 * 带有一个虚拟头节点dummy的LinkedList
 * 可以省略掉每次都判断头部的过程
 * Author: 3zZ.
 * Date: 2019/11/4 7:09 下午
 */
public class SingleLinkedListDummy<E> extends AbstractList<E> {

    private Node<E> first;

    public SingleLinkedListDummy() {
        first = new Node<>(null, null);
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder string = new StringBuilder();
            return string.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size = ").append(size).append(", elements: [");
        Node<E> node = first.next;
        for (int i = 0; i < size; i++) {
            if (i != 0) string.append(", ");
            string.append(node.element);
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        // 0位置 直接找到dummy头
        // 末尾也符合
        Node<E> prev = index == 0 ? first : node(index - 1);
        prev.next = new Node<E>(element, prev.next);
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> prev = index == 0 ? first : node(index - 1);
        Node<E> node = prev.next;
        prev.next = node.next;
        size--;
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        if (element == null) {
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else {
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (element.equals(node.element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    private Node<E> node(int index) {
        rangeCheck(index);

        Node<E> node = first.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
