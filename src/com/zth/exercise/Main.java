package com.zth.exercise;

import com.zth.ArrayAndLinkedList.Assert;
import com.zth.ArrayAndLinkedList.List;
import com.zth.ArrayAndLinkedList.circle.CircleLinkedList;

/**
 * Author: 3zZ.
 * Date: 2019/12/19 9:35 下午
 */
public class Main {
    static void testList(List<Integer> list) {
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list.add(0,55); // [55,11,22,33,44]
        list.add(2,66); // [55,11,66,22,33,44]
        list.add(list.size(), 77); // [55,11,66,22,33,44,77]

        list.remove(0); // [11,66,22,33,44,77]
        list.remove(2); // [11,66,33,44,77]
        list.remove(list.size() - 1); // [11,66,33,44]

        Assert.test(list.indexOf(44) == 3);
        Assert.test(list.indexOf(22) == List.ELEMENT_NOT_FOUND);
        Assert.test(list.contains(33));
        Assert.test(list.get(0) == 11);
        Assert.test(list.get(1) == 66);
        Assert.test(list.get(list.size() - 1) == 44);

        System.out.println(list);
    }

    public static void main(String[] args) {
        testList(new CircleLinkedList<>());
    }
}
