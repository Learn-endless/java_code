package com.java.test6;

import java.util.Arrays;
import java.util.Comparator;

class Student{
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

}
//age比较器
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
//score比较器
class ScoreComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score - o2.score);
    }
}
//name比较器
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22, 61.5);
        Student s2 = new Student("lisi", 20, 81.5);
        Student s3 = new Student("wangwu", 21, 71.5);
        Student[] students = {s1, s2, s3};

        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();

        System.out.println(Arrays.toString(students));

        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students,scoreComparator);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
    }
}