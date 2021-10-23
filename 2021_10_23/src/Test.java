import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-23
 * Time:  15:15
 */
public class Test {
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main(String[] args) {
        int a = 10;
        System.out.println("奇数位：");
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print((a >> i) & 1);
        }
        System.out.println();
        System.out.println("偶数位：");
        for (int i = 31; i >= 0 ; i-=2) {
            System.out.print((a >> i) & 1);
        }
    }

    // 输出一个整数的每一位
    public static void main_12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n % 10 != 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main_11(String[] args) {
        String a = new String("abc");
        if(a != "abc"){
            System.out.println("hahah");
        }
    }

    public static void main_10(String[] args) {
        String a = "abc";
        String b = "abc";
        if(a == b){
            System.out.println("haha");
        }
    }

    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    //入，最多输入三次。三次均错，则提示退出程序
    public static void main_9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            String n = sc.nextLine();
            if(n.equals("420528")){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("密码错误");
            }
            if(i == 2){
                System.out.println("退出程序");
            }
        }
    }

    //输出乘法口诀表
    public static void main_8(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%2d *%2d=%2d  ",j,i,i*j);
            }
            System.out.printf("\n");
        }
    }

    // 给定三个 int 变量, 求其中的最大值和最小值
    public static void main_7(String[] args) {
        int a = 20;
        int b = 80;
        int c = 50;
        int max = a;
        int min = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }

    //给定两个 int 变量, 交换变量的值
    public static void main_6(String[] args) {
        int a = 3;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    //三目运算符
    public static void main_5(String[] args) {
        System.out.println(3 > 5 ? 4 : 20);
        System.out.println(3 < 5 ? 4 : 20);
    }

    //移位运算符
    public static void main_4(String[] args) {
        int a = 1;
        int b = -1;
        System.out.println(a << 1);
        System.out.println(b >> 1);
        System.out.println(b >>> 1);
    }

    //位运算符
    public static void main_3(String[] args) {
        int a = 10; // 0000 0000 0000 0000 0000 0000 0000 1010
        int b = 20; // 0000 0000 0000 0000 0000 0000 0001 0100
        System.out.println(a & b);     //按位与
        System.out.println(a | b);     //按位或
        System.out.println(~a);        //按位取反
        System.out.println(a ^ b);     //按位异或
    }

    //逻辑运算符
    public static void main_2(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a && a);
        System.out.println(a || b);
        System.out.println(b || b);
        System.out.println(!a);

        System.out.println( (10 > 20) && ((10 / 0) == 0));
        System.out.println( (10 < 20) || ((10 / 0) == 0));
    }

    //关系运算符
    public static void main_1(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
