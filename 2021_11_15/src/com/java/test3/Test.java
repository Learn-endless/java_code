package com.java.test3;

//抽象类
public abstract class Test {
    //普通成员变量
    private int a = 10;

    public int getA() {
        return a;
    }

    public Test(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //抽象方法
    public abstract void eat();
}

class tt extends Test{

    public tt(int a) {
        super(a);
    }

    @Override
    public void eat() {

    }
}

class main{
    public static void main(String[] args) {
        Test m = new tt(199);
        System.out.println(m.getA());
    }
}