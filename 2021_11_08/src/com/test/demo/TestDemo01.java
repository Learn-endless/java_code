package com.test.demo;

import com.test.demo.Person;

public class TestDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类型对应的class对象

        //Class.forName("全类名")全类名=包名+类名
        Class cls1 = Class.forName("com.test.demo.Person");
        System.out.println(cls1);

        //类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        //创建一个person类型的对象
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);
        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
    }
}
