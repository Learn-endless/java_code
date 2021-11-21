package Comparable;

import java.util.Arrays;

class Student implements Comparable<Student>{
    public int age;
    public String name;
    public double score;
    public Student(int age, String name,double score){
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
//        return this.age - o.age;
//        return (int)(this.score - o.score);
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Student[] stu = {
                new Student(20,"zhangsan",45.2),
                new Student(19,"wangwu",55.2),
                new Student(21,"lisi",65.2),

        };
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}
