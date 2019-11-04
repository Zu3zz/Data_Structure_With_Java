package com.zth.datastruct.dynamicArray;

public class Main {
    static void test() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(10,"小毛"));
        personArrayList.add(new Person(12,"小黄"));
        personArrayList.add(new Person(14,"小蓝"));
        System.out.println(personArrayList);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(12);
        integerArrayList.add(14);
        integerArrayList.add(15);
        System.out.println(integerArrayList);
    }

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(10,"小毛"));
        personArrayList.add(new Person(12,"小毛"));
        personArrayList.add(new Person(14,"小蓝"));
        personArrayList.add(null);
        System.out.println(personArrayList.indexOf(null));

    }
}
