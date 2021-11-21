package Cloneable;

class A implements Cloneable{
    public int ret = 20;

    @Override
    public String toString() {
        return "A{" +
                "ret=" + ret +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age = 10;
    public A tmp = new A();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person t = (Person)super.clone();
        t.tmp = (A)this.tmp.clone();
        return t;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", tmp=" + tmp +
                '}';
    }
}
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();

        person1.tmp.ret = 199;
        System.out.println(person1);
        System.out.println(person2);
    }
}
