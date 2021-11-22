package prictare;

import javax.xml.ws.spi.http.HttpHandler;

public class User {
    public String cry;
    public static int year;

    public void Hh(){
        System.out.println("我啥都没干.....");
    }

    public static void Uu(){
        System.out.println("都是我干的.....");
        System.out.println(year);
        Student student = new Student();
        System.out.println(student.name);
    }

    public static class Student{
        public String name;
        public static int age;

        public Student(){
            this.name = "张三";
            this.age = 25;
        }

        public static void Xx(){
            //在静态内部类的静态方法中只能使用静态属性和静态方法(外部类和内部类中)
            System.out.println("年限："+year+"，年龄："+age+" ");
            Uu();
            User user = new User();
            user.Hh();
            System.out.println(user.cry);
        }

        public void Mm(){
            //在静态内部类的普通方法中只能使用静态内部类中的属性和方法，还有外部类的静态方法和属性
            System.out.println("名字："+name+"年龄："+age+"称呼："+"年限："+year);
            Uu();
            Xx();
            User user = new User();
            user.Hh();
            System.out.println(user.cry);
        }
    }
}
