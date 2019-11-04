package com.zth.datastruct.dynamicArray;

/**
 * Author: 3zZ.
 * Date: 2019/11/3 12:22 上午
 */
public class Assert {
    public static void test(boolean value) {
        try{
            if(!value) throw new Exception("测试未通过");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
