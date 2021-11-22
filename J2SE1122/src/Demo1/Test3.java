package Demo1;

public class Test3 {
    private String name;
    private int age;
    //局部内部类
    public void out(int num) {   //注意这里的 num 默认被 final 修饰 ：final int num
        System.out.println("我是一个外部内的成员方法！");
        int x = 20;              //这里的 x 也是默认被 final 修饰 ： final int x = 20;
        /**
         * 当局部内部类访问局部变量时，该变量为 final 修饰的常量
         */
        class Gaobo{
            private String str = "我是内部类的成员变量！";
            public int a = 10;
            public Gaobo(){
                this.str = "hello world!";
                this.a = 199;
                name = "孙悟空";
                age = 19999;
//                x = 10;
            }
            //局部内部类的方法
            public void print(){
                System.out.println(Test3.this.name+" "+age+" "+num+" "+x);
                System.out.println("我是内部类的成员方法！");
            }
        }
        Gaobo gaobo = new Gaobo();
        System.out.println(gaobo.str+" "+gaobo.a);
        gaobo.print();
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.out(555);
    }
}
