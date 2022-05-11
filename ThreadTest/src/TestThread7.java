
class A{
    public void func1(){
        System.out.println("11111");
    }
    private void func2(){
        System.out.println("22222");
    }
    public static void func3(){
        System.out.println("static...");
    }
}
class B extends A{
    public void func(){
        func1();
        System.out.println("BBBBBB");
        func3();         //在子类中可以调用父类的非私有方法
        A.func3();
    }
}

public class TestThread7 {

    public static void main(String[] args) {
        //实例化对象的时候，子类会先帮父类构造
        B b = new B();
        b.func();
        b.func1();
        A.func3();
    }

    public static void main2(String[] args) {
        Thread t = new Thread("继承Thread类创建的多线程"){
            @Override
            public void run() {
                //这时两种写法都可以
                System.out.println("当前线程的名字:"+Thread.currentThread().getName());
                System.out.println("当前线程的名字:"+this.getName());
            }
        };
        t.start();
    }

    public static void main1(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程的名字:"+Thread.currentThread().getName());
            }
        },"实现Runnable接口创建的多线程");
        t.start();
    }
}
