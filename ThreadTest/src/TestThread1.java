/**
 * 通过使一个类继承Thread，并重写run方法来实现
 */
class Rabbit extends Thread{
    @Override
    public void run() {
        //这个里面就写 Rabbit 线程的业务逻辑
        int count = 0;
        while(count < 20){
            System.out.println("rabbit跳出了第 "+count+" 步》》");
            count++;
        }
    }
}

/**
 * 让一个类实现 Runnable 接口，并重写 run 方法来实现
 */
class Dog implements Runnable{
    @Override
    public void run() {
        //dog线程的业务逻辑
        int count = 0;
        while(count < 20){
            System.out.println("dog叫出了第 "+count+" 声》》");
            count++;
        }
    }
}

public class TestThread1 {

    public static void main6(String[] args) {
        Thread t = new Thread(()->System.out.println("这是一个使用lambda表达式的创建多线程的匿名内部类写法..."));
        t.start();
    }

    public static void main5(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("这是一个使用lambda表达式的创建多线程的匿名内部类写法...");
        });
        t.start();
    }

    /**
     * 使用匿名内部类的方式来创建多线程
     */
    public static void main4(String[] args) {
        Thread bird = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("小鸟在飞...");
            }
        });
        bird.start();
    }

    public static void main3(String[] args) {
        /**
         *
         */
        Thread bird = new Thread(){
            @Override
            public void run() {
                System.out.println("另一只小鸟也在飞...");
            }
        };
        bird.start();
    }

    public static void main2(String[] args) {
        Dog dog1 = new Dog();
        Thread dog = new Thread(dog1);

        dog.start();   //创建并启动线程

    }

    public static void main1(String[] args) {
        Thread rabbit = new Rabbit();
        rabbit.start();               //创建并启动 rabbit 线程

        //注意这时，这里有两个线程 main 和 rabbit
    }
}
