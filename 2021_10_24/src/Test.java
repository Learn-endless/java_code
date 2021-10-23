import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-23
 * Time:  17:31
 */
public class Test {
    //使用方法
    public static  int sumAdd(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumAdd(10));
    }

    public static void main_3(String[] args) {
        Random ra = new Random();  //当给定参数时，每次运行的随机数就是根据这个随机种子所生成的。
        Scanner sc = new Scanner(System.in);
        int ret = ra.nextInt(101);   //[0,101)
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(n);
        }
    }

    public static void main_2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        String n = sc.nextLine();   //读入一行字符串，可以包含空格
        String m = sc.next();       //读入一行字符串，不会读空格，遇到空格停止读入
//        int a = sc.nextInt();       //注意读入int时，不能放到读入一行字符串前面
        System.out.println(a);
        System.out.println(m);
    }

    //从键盘读入一个字符
    public static void main_1(String[] args) throws IOException {
        char ret = (char)System.in.read();
        System.out.println(ret);
    }
}
