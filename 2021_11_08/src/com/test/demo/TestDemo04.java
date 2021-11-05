package com.test.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 获取成员方法：
 *      Method[] getMethods()
 *      Method getMethod(String name)
 *
 *      Method[] getDeclaredMethods()
 *      Method get
 */
public class TestDemo04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls = Person.class;
        //获取所有的被public修饰的成员方法
        Method[] methods = cls.getMethods();
        System.out.println(methods.length);

        //获取指定的成员方法
        //无参的show方法
        Method method = cls.getMethod("show");
        /**
         * 执行方法
         * Object invoke(Object obj,Object...args)
         */
        Person p = new Person();

        //获取有参的show方法
        Method method1 = cls.getMethod("show",String.class);
        method.invoke(p);
        method1.invoke(p,"被重载的show方法执行了");

//        Date data = new Date();
//        data.

    }
}
