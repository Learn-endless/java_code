import java.util.Random;
import java.util.Scanner;

public class code {
    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    //求两个正整数的最大公约数
    public static void main_10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n1 % n2;
        while(n3 != 0){
            n1 = n2;
            n2 = n3;
            n3 = n1 % n2;
        }
        System.out.println(n2);
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main_9(String[] args) {
        double sum = 0.0;
        int flag = 1;
        for (int i = 1; i < 100; i++) {
            sum += flag*(1.0/i);
            flag = -flag;
        }
        System.out.println(sum);
    }

    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，
    // 如；153＝1＋5＋3?，则153是一个“水仙花数“。）
    public static void main_8(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int n = i % 10;
            int m = i / 10 % 10;
            int u = i / 100;
            if((n*n*n) + (m*m*m) + (u*u*u) == i){
                System.out.println(i);
            }
        }
    }

    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
    public static void main_7(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random sj = new Random();
        System.out.print("请输入数字:");
        int temp = sj.nextInt(100);
        while(true){
            int ret = sc.nextInt();
            if(ret > temp){
                System.out.println("大了");
            }else if(ret < temp){
                System.out.println("小了");
            }else{
                break;
            }
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的X形图案。
    public static void main_6(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else if ((i + j) == (n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.printf("\n");
            }
        }
    }


    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main_5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input < 18){
            System.out.println("少年");
        }else if(input <= 28){
            System.out.println("青年");
        }else if(input <= 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }

    //给定一个数字，判定一个数字是否是素数
    public static void main_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    //打印 1 - 100 之间所有的素数
    public static void main_3(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            int flag = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.printf("%d ", i);
            }
        }
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main_2(String[] args) {
        for (int i = 1000; i <= 2000 ; i++) {
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                System.out.printf("%d ",i);
            }
        }
    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main_1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            int n = i;
            while(n % 10 != 0 || n / 10 == 9){    // 为了避免90这种个位是0的整数。
                if(n % 10 == 9){
                    count++;
                }
                n /= 10;
            }
        }
        System.out.println(count);
    }
}
