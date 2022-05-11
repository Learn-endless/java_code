
public class TestThread8 {
    //使用Thread类中自带的标志位来完成线程的中断
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            //判断是否是中断状态
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+"...");
                //避免打印过快，这里需要加上一个sleep
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //这时如果触发 InterruptedException 异常,则先打印一下栈轨迹,然后进行收尾工作,最后提前结束 run 方法
                    System.out.println("处理收尾工作...");
                    break;
                }
            }
        },"线程A");
        t.start();

        //由于我们把上面的sleep给去掉了，所以这里就给小一些，方便查看结果
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //设置标志位，进行中断
        t.interrupt();
    }
}
