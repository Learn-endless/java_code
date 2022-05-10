
public class TestThread5 {
    public static void main(String[] args){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //循环打印 hello run()...
                while(true){
                    System.out.println("hello run()...");
                    try {
                        //防止打印太快，加个sleep
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //调用t中run方法,用来对比结果
//        t.run();
        t.start();
        //这里是main线程执行的逻辑：循环打印 hello main()... 也加个sleep
        while(true){
            System.out.println("hello main()...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
