package Comparator;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    public int age;
    public String name;
    public double score;
    public Student(int age, String name,double score){
        this.age = age;
        this.name = name;
        this.score = score;
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
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
class ScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score - o2.score);
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1,Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] stu = {
                new Student(20, "zhangsan", 45.2),
                new Student(19, "wangwu", 55.2),
                new Student(21, "lisi", 65.2),

        };
        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(stu, nameComparator);
        System.out.println(Arrays.toString(stu));
    }
}
