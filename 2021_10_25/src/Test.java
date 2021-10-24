import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-23
 * Time:  21:13
 */
public class Test {

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static void main_12(String[] args) {
        int a = 3;
        int b = 5;
        double c = 2.0;
        double d = 3.0;
        double e = 5.0;
        System.out.println(sumDigit(a, b));
        System.out.println(sumDigit(c, d, e));
    }

    public static int sumDigit(int a,int b){
        return a + b;
    }

    public static double sumDigit(double a,double b,double c){
        return a + b + c;
    }

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static void main_11(String[] args) {
        int a = 10;
        int b = 20;
        double c = 10.0;
        double d = 20.0;
        System.out.println(intDoubleMax(a,b));
        System.out.println(intDoubleMax(c,d));
        System.out.println("a"+intDoubleMax(a,d)+"b");
    }

    public static int intDoubleMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static double intDoubleMax(double a,double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static char intDoubleMax(int a,double b){
        if(a > b){
            return '>';
        }else{
            return '<';
        }
    }

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main_10(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三个数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max3(a, b, c));
    }

    /**
     * 求三个数中的最大值
     * @param a 一个整数
     * @param b 一个整数
     * @param c 一个整数
     * @return 三个数中的最大值
     */
    public static int max3(int a,int b,int c){
        return max2(a,max2(b,c));
    }

    /**
     * 求两个数中的最大值
     * @param a 一个整数
     * @param b 一个整数
     * @return 两个数中的最大值
     */
    public static int max2(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static void main_9(String[] args) {
        int[] arr = {2,4,6,8,1,3,5,7};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left < right && arr[left] % 2 != 0){   //每次在找偶数的时候也要满足做下标，小于右下标。不然换完最后一个后，还会再换一次
                left++;
            }
            while(left < right && arr[right] % 2 == 0){  //同理
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //求 N 的阶乘 。
    public static void main_8(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入N的值》");
        int ret = sc.nextInt();
        System.out.println(numFac(ret));
    }

    /**
     * 求n的阶乘
     * @param n 一个整数
     * @return n的阶乘
     */
    public static int numFac(int n){
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
        }return temp;
    }

    //求1！+2！+3！+4！+........+n!的和
    public static void main_7(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int ret = sc.nextInt();
        System.out.println(sumFac(ret));
    }

    /**
     * 求n的阶乘之和
     * @param n 多少项之和
     * @return 返回阶乘之和
     */
    public static int sumFac(int n){
        int sum = 0;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
            sum += temp;
        }return sum;
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static void main_6(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要找的第n项：");
        int n = sc.nextInt();
        System.out.println(findFib(n));
    }

    /**
     * 求第n项的斐波那契数列
     * @param n 所求第几项
     * @return 第n项的值
     */
    public static int findFib(int n){
        int a = 0;
        int b = 1;
        int c = a + b;
        if(n == 2 || n == 3){
            return 1;
        }else if(n == 1){
            return 0;
        }
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }return c;
    }

    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main_5(String[] args) {
        int[] temp = {1,1,2,2,3,3,4};
        System.out.println(findSingle(temp));
    }

    /**
     * 在一组数中找出单身狗
     * @param temp 接收一组数
     * @return 那个单身狗
     */
    public static int findSingle(int[] temp){
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum ^= temp[i];
        }
        return sum;
    }

    //输出n*n的乘法口诀表，n由用户输入。
    public static void main_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入n的值》");
        int ret = sc.nextInt();
        printMultiplicationTable(ret);
    }

    /**
     * 打印n*n的乘法口诀表
     * @param n 输入一个整数
     */
    public static void printMultiplicationTable(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d*%d=%-4d",j ,i ,i*j);
            }
            System.out.println();
        }
    }

    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main_3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数》");
        int ret = sc.nextInt();
        printDigit(ret);
    }

    /**
     * 打印一个整数的每一位
     * @param n 输入的整数
     */
    public static void printDigit(int n){
        if(n < 10){
            System.out.print(n+" ");
        }else{
            printDigit(n/10);
            System.out.print((n%10)+" ");
        }
    }

    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，最多输入三次。
    // 三次均错，则提示退出程序
    public static void main_2(String[] args) {
        inputPassword();
    }

    /**
     * 模拟密码登录方法
     */
    public static void inputPassword(){
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.print("请输入密码：");
            String str = sc.nextLine();
            if(str.equals("123456")){
                System.out.println("登录成功！");
                return;
            }else{
                count--;
                if(count == 0){
                    System.out.println("密码错误！");
                    break;
                }
                System.out.println("密码错误，请重新输入，还剩"+count+"次");
            }
        }System.out.println("退出程序！！！");
    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main_1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int ret = sc.nextInt();
        printByte(ret);
    }

    /**
     * 输出一个整数的二进制奇数位和偶数位
     * @param n 输入的整数
     */
    public static void printByte(int n){
        System.out.println("二进制奇数位：");
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print((n >> i) & 1);
        }
        System.out.println();
        System.out.println("二进制偶数位：");
        for (int i = 31; i >= 0 ; i-=2) {
            System.out.print((n >> i) & 1);
        }
    }
}
