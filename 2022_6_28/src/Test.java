

class H{
    protected H func(int a,double b){
        return new H();
    }
}

class A implements Comparable<A>{

    @Override
    public int compareTo(A o) {
        return 0;
    }
}

class B extends H{
    @Override
    protected B func(int b,double a) {
        return new B();
    }
}

abstract class C{
    public void func(){
        System.out.println("...");
    }
}

interface W{
     public void func();

}

class Person implements Cloneable {
    public void func(){
        System.out.println("hello word");
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class Test {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str2);

        System.out.println("=================");

        String s1 = new String("1")+new String("1");
        s1.intern();         //将 "11" 手动入 字符串常量池中
        String s2 = "11";    //回先在 字符串 常量池中寻找 "11"
        System.out.println(s1 == s2);   //true

    }

    public static void main2(String[] args) {
        String str1 = "abcdef";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);

        str1 = "bit";
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main1(String[] args) {
        Person person = new Person();
        Person person1 = person.clone();
        person1.func();
    }
}