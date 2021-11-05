package com.test.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestDemo03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取字节码对象
        Class cls = Person.class;
        //获取所有的被public修饰的构造方法
        Constructor[] cons = cls.getConstructors();
        System.out.println(cons.length);

        //获取指定的构造方法

        //获取空参的构造方法
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);
        //获取有参的构造方法
        Constructor constructor1 = cls.getConstructor(String.class,String.class);
        System.out.println(constructor1);

        //构造方法的作用，创建对象，进行属性的初始化

        /**
         * 创建对象
         * T newInstance(Object...initargs)
         * 使用空参数构造方法创建对象，操作可以简化Class对象的newInstance方法
         */
        Person p1 = (Person) constructor.newInstance();
        p1.show();

        Person p2 = (Person) constructor1.newInstance("zhangsan","21");
        System.out.println(p2);
    }
}
