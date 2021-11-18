package com.java.test2;

import com.java.test1.test1;

public class test2 extends test1 {
//    public void func(){
//        System.out.println(val);
//    }

    //重写的条件：
    //1.方法名相同
    //2.参数列表相同(个数，类型，顺序)
    //3.返回值相同(一个例外：)
    //4.继承关系
    @Override
    public void eat() {
        System.out.println("hahahaha");
    }

//    public static void main(String[] args) {
//        test1 t = new test2();
//        t.eat();
//    }
}
