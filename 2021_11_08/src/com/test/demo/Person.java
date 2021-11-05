package com.test.demo;
@SuppressWarnings("all")
@MyiAnno({"123","avc"})
public class Person {
    private  String age;
    private   String name;

    public String n;
    public String m;

    public Person() {

    }
    public void show(){
        System.out.println("show...");
    }

    public void show(String msg){
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
