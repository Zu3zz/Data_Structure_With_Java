package com.zth.Stack;

/**
 * Author: 3zZ.
 * Date: 2019/12/20 12:36 上午
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
