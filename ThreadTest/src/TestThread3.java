public class TestThread3 {
    /**
     * 使用多线程和单线程比较执行自增10亿次的时间
     */
    public static long N = 10_0000_0000L;

    /**
     * 使用多线程，分别自增10亿次
     */
    public static void MyThread() throws InterruptedException {
        //记录开始时的时间
        long start = System.currentTimeMillis();
        //创建一个线程自增10亿次
        Thread t1 = new Thread(()->{
            int count = 0;
            while(count < N){
                count++;
            }
        });
        //创建另一线程自增10亿次
        Thread t2 = new Thread(()->{
            int count = 0;
            while(count < N){
                count++;
            }
        });

        //启动两个线程
        t1.start();
        t2.start();
        //上面两个线程不执行完，不能往下走
        t1.join();
        t2.join();
        //记录结束时间
        long end = System.currentTimeMillis();
        //计算时间差
        System.out.println("消耗时间:"+(end-start)+"ms");
    }

    //使用单线程分别自增10亿次
    public static void singleThread(){
        //记录开始时的时间
        long start = System.currentTimeMillis();
        int count = 0;
        while(count < N){
            count++;
        }
        count = 0;
        while(count < N){
            count++;
        }
        //记录结束时间
        long end = System.currentTimeMillis();
        //计算时间差
        System.out.println("消耗时间:"+(end-start)+"ms");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread();
//        singleThread();
    }
}
