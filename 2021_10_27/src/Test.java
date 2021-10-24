import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-24
 * Time:  20:00
 */
public class Test {

    //递归求 N 的阶乘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numFac(n));
    }

    /**
     * 递归求n的阶乘
     * @param n 一个整数
     * @return 返回n的阶乘
     */
    public static int numFac(int n){
        if(n == 1){
            return 1;
        }else{
            return n * numFac(n - 1);
        }
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static void main_6(String[] args) {
        int ret = sumTen(10);
        System.out.println(ret);
    }
    public static int sumTen(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sumTen(n-1);
        }
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void main_5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }

    /**
     * 顺序打印一个数字的每一位
     * @param n 一个数字
     */
    public static void printNum(int n){
        if(n < 10){
            System.out.print(n+" ");
        }else{
            printNum(n/10);
            System.out.print(n%10+" ");
        }
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static void main_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNum(n));
    }

    /**
     * 求一个非负整数的各个位上的数字之和
     * @param n 一个非负整数
     * @return 各个位上的数字之和
     */
    public static int sumNum(int n){
        if(n < 10){
            return n;
        }else{
            return n%10 + sumNum(n/10);
        }
    }

    //递归求斐波那契数列的第 N 项
    public static void main_3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFib(n));
    }

    /**
     * 求第n项斐波那契数
     * @param n 第几项
     * @return  返回那一项的值
     */
    public static int findFib(int n){
        if(n == 1){
            return 0;
        }else if(n == 2 || n == 3){
            return 1;
        }else{
            return findFib(n - 1) + findFib( n - 2);
        }
    }

    //递归求解汉诺塔 - 将 A 柱的黄金圆盘借助 B 柱，移动到 C 柱上去
    public static void main_2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoiNum(n, 'A', 'B','C');
    }

    /**
     * 移动盘子的步骤
     * @param n  盘子的个数
     * @param post1 起始柱 —— A 柱
     * @param post2 中转柱 —— B 柱
     * @param post3 终点柱 —— C 柱
     */
    public static void hanoiNum(int n, char post1, char post2, char post3){
        if(n == 1){
            move(post1,post3);
        }else{
            hanoiNum(n-1, post1, post3, post2);
            move(post1,post3);
            hanoiNum(n-1, post2, post1, post3);
        }
    }

    /**
     * 移动盘子
     * @param post1 起始位置
     * @param post2 终点位置
     */
    public static void move(char post1, char post2){
        System.out.print(post1+"-->"+post2+" ");
    }

    //青蛙跳台阶问题
    public static void main_1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("方法有："+frogJump(n)+"种");
    }

    /**
     * 求青蛙有多少种跳法
     * @param n 台阶数
     * @return 有多少种跳法
     */
    public static int frogJump(int n){
        if(n == 1 || n == 2){
            return n;
        }else{
            return frogJump(n - 1) + frogJump(n - 2);
        }
    }
}
