package com.test.demo;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TestDemo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.获取class对象
        Class cls = Person.class;

        //2.Field[]getFields():获取所有public修饰的成员变量
        Field[] fields = cls.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        //getField(String name)
        Field field = cls.getField("n");
        System.out.println(field);

        //Field[]getDeclaredFields()
        Field[] fields1 = cls.getDeclaredFields();
        for (int i = 0; i < fields1.length; i++) {
            System.out.println(fields1[i]);
        }

        //Field[] getDeclaredField[""]
        Field field2 = cls.getDeclaredField("name");
//        System.out.println(field2);

        /**
         * 1.void set(Object obj,Object value) :设置值
         * 2.get(Object obj) :获取值
         * 忽略访问权限修饰符的安全检查
         * 3.setAccessible(true):暴力反射
         */
        field2.setAccessible(true);
        Person p = new Person();
        field2.set(p,"张三");
        Object object = field2.get(p);
        System.out.println(object);

    }
}
