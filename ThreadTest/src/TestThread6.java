
public class TestThread6 {

    //通过自定义标志位来实现线程的中断
    public static boolean isTrue = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!isTrue){
                    System.out.println("hello Thread...");
                    //来个sleep,方便我们观察效果
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //在内存中创建并启动线程
        t.start();

        //5秒之内不会对 标志位(isTrue) 进程更改
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更改标志位
        isTrue = true;
        System.out.println("main线程以执行，标志位已更改！！！");
    }
}
