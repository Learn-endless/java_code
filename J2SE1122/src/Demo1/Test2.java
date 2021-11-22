package Demo1;

public class Test2 {
    private String name;
    private int age;
    //成员内部类
    public class Gaobo{
        private String str = "我是内部类的成员变量！";
        public int a = 10;
        public Gaobo(){
            this.str = "hello world!";
            //内部类对外部类的属性进行赋值
            name = "张三";
            age = 25;
        }
        public class Anmial{

        }
        public void print(){
            System.out.println("我是内部类的成员方法！");
            //内部类访问外部类的成员方法
            out();
        }
    }

    public void out(){
        System.out.println("我是一个外部内的成员方法！");
        Gaobo gaobo = new Gaobo();
        System.out.println("这是在外部类调用："+gaobo.str);
//        gaobo.print();
    }

    public static void main(String[] args) {
        //创建外部类的对象
        Test2 test2 = new Test2();
        Test2.Gaobo gaobo = test2.new Gaobo();
        System.out.println(test2.name);
        System.out.println(test2.age);
        test2.out();
        System.out.println(gaobo.str);
        gaobo.print();
    }
}
