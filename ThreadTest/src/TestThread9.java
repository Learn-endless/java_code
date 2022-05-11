public class TestThread9 {
    public static void main(String[] args) throws InterruptedException {
        //第一线程
        Thread t1 = new Thread(()->{
            for(int i = 1; i <= 5;i++){
                System.out.println(Thread.currentThread().getName()+" 执行到了第 "+i+" 次");
            }
        },"Thread-1");

        //第二个线程
        Thread t2 = new Thread(()->{
            for(int i = 1; i <= 5;i++){
                System.out.println(Thread.currentThread().getName()+" 执行到了第 "+i+" 次");
            }
        },"Thread-2");

        //在内存中创建并启动t1和t2线程
        t1.start();
        t2.start();

        //让main线程进行等待,等待t1和t2执行完毕
        t1.join();
        t2.join();

        //main线程所要执行的操作
        System.out.println("这里是main线程的工作...");
    }
}
