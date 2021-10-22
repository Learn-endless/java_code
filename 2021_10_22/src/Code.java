/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-21
 * Time:  22:36
 * 操作符详解
 */
public class Code {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);
    }

    public static void main_4(String[] args) {
        int i = 1;
        int b = 0;
        b = i++;    //等价于 b = (i+=1);
        System.out.println(b);
    }

    public static void main_3(String[] args) {
        byte a = 2;
        byte b = 3;
        byte c = (byte)(a + b);
        b += a;
        System.out.println(b);
    }

    public static void main_2(String[] args) {
        System.out.println(5 * 10.0);
        System.out.println(10.0 / 5);
        System.out.println(10 / 6);
        System.out.println(10.5 % 5);

        //System.out.println(10 % 0);   //编译失败，报错
        //System.out.println(10 / 0);   //编译失败，报错
    }

    public static void main_1(String[] args) {
        int a = 2;
        double b = 3.0;
        int c = 5;
        double d = 5.0;
        System.out.println(a+b);
        System.out.println(a+c);
        System.out.println(b+d);
    }
}
