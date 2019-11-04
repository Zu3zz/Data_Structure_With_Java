package com.zth.datastruct.dynamicArray;

/**
 * Author: 3zZ.
 * Date: 2019/11/3 1:26 上午
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Person - finalize");
    }
    @Override
    public boolean equals(Object object){
        Person person = (Person) object;
        return this.age == person.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
