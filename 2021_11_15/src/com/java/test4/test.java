package com.java.test4;

public class test implements A{
    @Override
    public void eat() {
        System.out.println("fly.....");
    }
}

class main{
    public static void main(String[] args) {
        A a = new test();
        a.eat();
        System.out.println(A.a);
        System.out.println(A.b);
        A.jump();
    }
}