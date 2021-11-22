package prictare;

import Demo1.Test2;
import Demo1.Test4;

public class School {
    public String name;
    public double area;

    public void cry(){
        System.out.println("我们学校叫"+name+",占地"+area+"平方米");
//        Teacher teacher = new Teacher();
//        teacher.GaoBo();
//        System.out.println(teacher.teacherName);
//        System.out.println(teacher.age);

    }

    public class Teacher{
        public String teacherName;
        public int age;

        public Teacher(){
            teacherName = "王丽";
            age = 22;
            School.this.name = "龙舟坪镇中心学校";
            School.this.area = 458.2;
        }
        public void GaoBo(){
            System.out.println("我叫"+teacherName+",我是"+School.this.name+"的老师。");
            cry();
        }
    }

}
