public class TestThread10 {
    public static void main1(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            int count = 0;
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+" 正在执行第 "+count+" 次");
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread - 1");

        Thread t2 = new Thread(()->{
            int count = 0;
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+" 正在执行第 "+count+" 次");
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread - 2");
        //在内存中创建并启动线程
        t1.start();
        t2.start();
        //main线程调用 join 方法，等待 t1 和 t2 执行完毕，但是最多等3秒
        t1.join(3000);
        t2.join(3000);
        //main线程的内容
        int count = 0;
        while(true){
            System.out.println("main线程开始执行了第 "+ count+" 次");
            count++;
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            int count = 0;
            while(count < 100){
                System.out.println("hello world>>>>");
                //每打印一次，就休眠一段时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //在内存中创建并启动线程
        t.start();
    }
}
