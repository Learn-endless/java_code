/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-31
 * Time:  15:12
 *
 * 序列化：将对象转化成字符串
 * 反序列化：将字符串转化为对象
 */
//类：对有相同特性和行为的事物的统称，是一种抽象概念
//这里将人抽象成一个类——Person
class Person{
    //成员变量(也叫属性或字段)表示特征。
    //成员变量分为：普通成员变量和静态成员变量。
    private String name;    //private:进行封装，使变量或者方法只能在该类中使用，所以这时就需要接口
    public int age = 200;
    //静态成员变量(类变量) —— 它是属于类的，存放到方法区
    public static int count = 200;

    /**
     * 总结：定义成员变量(普通或静态)然后在代码块(实例或静态)中初始化后，最终成员变量的值是什么？
     * 定义的成员变量本身就有初始化时，按照程序的执行顺序，最终值为后面的那一个。—— 普通或静态都是如此
     * 特殊：如果在实例代码块中对静态成员变量进行初始化，结果始终为实例代码块的内容。
     */

    {
        /**
         * 有什么用：
         * 可以用来进行成员变量初始化
         * 既可以初始化普通成员变量，也可以初始化静态成员变量
         */
        this.age = 199;
        count = 50;
        System.out.println("这是一个实例代码块(构造代码块)！！！！");
    }

    static{
        /**
         * 有什么用：
         * 可以用来进行成员变量初始化
         * 注意只能用来初始化static修饰的静态成员变量
         */

        System.out.println("这是一个静态代码块！！！！");
    }


    /**
     * 构造方法：
     * 1.方法名和类名相同。
     * 2.构造方法没有返回值。
     * 3.每一个类都至少有一个构造方法。
     * 4.如果这个类没有任何的构造方法，编译器就会自动生成一个不带参数的构造方法(代码块里也是空的)
     * 5.构造方法可以使用重载。
     */

    //不带参数的构造方法
    public Person(){
//        /**
//         * this有三种用法：
//         * 1.this.data         调用当前对象的属性
//         * 2.this.func()       调用当前对象的方法
//         * 3.this()            调用当前对象的其他构造方法
//         */
//        this("world"); //注意：对“this（）”的调用必须是构造函数体中的第一条语句，并且它只能放到构造方法里面
//
//        this.name = "bit";
//        this.age = 22;
//        System.out.println("名字："+name+" 年龄:"+age);
    }

    //重载+带一个参数的构造方法
    public Person(String name){
        this.name = name;
        System.out.println("名字："+name+" 年龄:"+age);
    }

    //重载+带两个参数的构造方法
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("名字："+name+" 年龄:"+age);
    }

    //方法(也叫函数)表示行为。
    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void sleep(){
        System.out.println("年龄为"+age+"的"+name+"正在睡觉");
    }

    //类方法(static修饰的变量和方法，在使用时不用实例化对象)
    public static void run(){
        System.out.println(count +"跑起来了");
    }

    //可以自动重写设置接口和获取接口
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*    public void setName(String name){
        this.name = name;    //this：表示这个对象的引用
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {

    public static void main(String[] args) {
        new Person().eat();  //匿名对象 —— 只能在创建时使用一次
        System.out.println(new Person().age);
    }

    public static void main_6(String[] args) {
        Person person = new Person();
        System.out.println(Person.count);
//        System.out.println(person.age);
    }

    public static void main_5(String[] args) {
        {
            System.out.println("这是一个本地代码块(普通代码块)！！！！");
        }
        /**
         * 静态代码块即使不实例化对象也会被执行一次
         * 什么时候执行：类加载的过程中
         */
        System.out.println(Person.count);
        System.out.println(Person.count);
        System.out.println(Person.count);
    }

    public static void main_4(String[] args) {

        /**
         * new一个对象的过程：
         * 1.为对象分配内存
         * 2.调用静态代码块(如果有的话)-----注意如果实例化多个对象时，静态代码块只会执行一次
         * 3.调用实例代码块(如果有的话)
         * 4.调用对象的构造方法(也就是说在实例化一个对象的时候，默认执行此方法)
         */
        Person person = new Person();
        System.out.println("=============================");
        Person person1 = new Person("xwj");
        System.out.println("=============================");
        Person person2 = new Person("zhang",25);
    }

    public static void main_3(String[] args) {
        Person person = new Person();
//        person.name = "hello";
//        person.age = 21;
        person.setName("hello");
        person.setAge(21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

/*
    Person person = new Person();

    public static void main_2(String[] args) {

        TestDemo testDemo = new TestDemo();
        //上面的代码表示person这个实例化对象是属于TestDemo类的
        //只要执行了上面的TestDemo实例化对象，就说明也就有了person的实例化对象
        //这时需要注意，person这个引用就是存放到堆上的，而不是在栈上。

        Person person = new Person();
        Person person1 = person;
        //上面代码表示person1指向person所指向的那个对象
        //简单来书就是它们同时指向一个对象。

        Person person2 = new Person();
        person2 = new Person();
        person2 = new Person();
        person2 = new Person();
        person2 = new Person();
        person2 = new Person();
        //上面的代码表示一个引用不能同时指向不同的对象。
        //其实上面的代码person2最终指向的是最后一个对象。

        Person person3 = null;
        //这个代码的意思是person3这个引用没有指向对象

    }

    //面向对象
    public static void main_1(String[] args) {
        //这叫实例化一个对象
        Person person = new Person();
        //可以由一个类实例化多个对象，每个对象都有属性和方法
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        //person是一个引用类型
        //在不赋值时，成员变量中基本数据类型的值为0和false(boolean类型)
        //引用类型默认是null
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("======================");
        person.name = "hello world";
        person.age = 21;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("======================");
        //每一个实例化的对象都有它的属性和方法
        System.out.println(person1.name);
        System.out.println(person1.age);
        person.eat();
        person.sleep();
        Person.count++;
        System.out.println(Person.count);
        Person.count++;
        System.out.println(Person.count);
    }
*/
}
