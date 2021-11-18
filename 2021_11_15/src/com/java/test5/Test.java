package com.java.test5;


import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    //谁调用这个compareTo方法，this就是谁
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22, 61.5);
        Student s2 = new Student("lisi", 20, 81.5);
        Student s3 = new Student("wangwu", 21, 71.5);
        Student[] students = {s1, s2, s3};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
