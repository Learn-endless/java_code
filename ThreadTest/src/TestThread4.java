public class TestThread4 {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"正在执行...");
                //这时就不能使用 this 了,原因在下面解答。这里不过多介绍。
            }
        },"线程二");
        t.start();
    }



    public static void main1(String[] args) {
        Thread t = new Thread("线程一"){
            @Override
            public void run() {
                System.out.println(this.getName()+"正在执行...");
            }
        };
        t.start();
    }
}
