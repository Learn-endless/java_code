package Demo1;

public class Test {
    public static void main(String[] args) {
        String a = "1234";
        String b = a;
        String c = new String("4444");
        String d = new String(c);
        System.out.println(a == b);
        System.out.println(c.equals(d));
        System.out.println(c == d);
    }

    //Integer包装类
    public static void main_1(String[] args) {
        int a = 1;
        Integer b = 10;
        String s = "12.5";
        System.out.println(Double.parseDouble(s));
        System.out.println(Integer.BYTES);  //打印字节
        System.out.println(Integer.MIN_VALUE); //最大值
        System.out.println(Integer.MAX_VALUE); //最小值

        Integer A = new Integer("199");
        Integer B = 199;  //自动装箱
        int C = B;        //自动拆箱
        System.out.println(A);
        System.out.println(B);
        // 用parseXxx()将字符串转换成一个整数或parseXxx()转换成一个浮点数
    }
}
