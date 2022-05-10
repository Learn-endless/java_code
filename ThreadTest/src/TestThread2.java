/**
 * 模拟实现吃早餐
 */
public class TestThread2 {
    public static void main(String[] args) {
        //吃包子线程
        Thread eat1 = new Thread(()-> {
            while(true){
                System.out.println("早餐吃 包子 ...");
                //为了能更好的看到现象，这里加上一个 sleep
                try {
                    Thread.sleep(2000);       //这里的意义不是2秒后上CPU，而是2秒内该线程上不了CPU
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        eat1.start();

        //吃油条线程
        Thread eat2 = new Thread(()-> {
            while(true){
                System.out.println("早餐吃 油条 ...");
                //为了能更好的看到现象，这里加上一个 sleep
                try {
                    Thread.sleep(2000);       //这里的意义不是2秒后上CPU，而是2秒内该线程上不了CPU
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        eat2.start();
    }
}