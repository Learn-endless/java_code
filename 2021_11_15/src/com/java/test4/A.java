package com.java.test4;

public interface A {
    //接口里面的属性只能是常量.
    //固定写法——public final static 类型 变量名 = 值
    public final static int a = 10;
    //或者不写，默认的就是 public final static
    int b = 10;

    //方法只能是抽象方法
    //固定写法——public abstract 返回值类型 方法名(参数列表);
    public abstract void eat();

    //特例：接口里面可以有默认方法
    //格式：default public 返回值类型 方法名(参数列表){}
    default public void run(){

    }

    //接口里面也可以有静态方法
    public static void jump(){
        System.out.println("hello world");
    }


}
