package com.zth.Stack.List;

/**
 * Author: 3zZ.
 * Date: 2019/11/4 7:09 下午
 */
public class LinkedList<E> extends AbstractList<E> {

    private Node<E> first;
    private Node<E> last;

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (prev != null) {
                sb.append(prev.element);
            }else{
                sb.append("null");
            }
            sb.append("<->").append(element).append("<->");
            if (next != null) {
                sb.append(next.element);
            }else {
                sb.append("null");
            }
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size = ").append(size).append(", elements: [");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i != 0) string.append(", ");
            string.append(node);
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }

    @Override
    public void clear() {
        size = 0;
        first = last = null;
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

        // size = 0/ index = 0
        if (index == size) {
            Node<E> oldLast = last;
            last = new Node<E>(oldLast, element, null);
            if (oldLast == null) {
                first = last;
            } else {
                oldLast.next = last;
            }

        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<E>(prev, element, next);
            next.prev = node;
            if (prev == null) {
                first = node;
            } else {
                prev.next = node;
            }
        }

        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev == null) { // index = 0
            first = next;
        } else {
            prev.next = next;
        }
        if (next == null) { // index = size - 1
            last = prev;
        } else {
            next.prev = prev;
        }
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
        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<E> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

}
