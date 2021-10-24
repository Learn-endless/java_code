import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-24
 * Time:  14:20
 */
public class Test {

    //青蛙跳台阶
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        int n = 5;
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }

    //用递归求第n项的斐波那契数
    public static void main_5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = sc.nextInt();
        System.out.println(numFib(ret));
    }

    public static int numFib(int n){
        if(n == 1){
            return 0;
        }else if(n <= 3){
            return 1;
        }else{
            return numFib(n-1)+numFib(n-2); //斐波那契数不要用递归实现，会有大量的重复操作。
            //最好使用迭代实现
        }
    }

    //用递归法求一个非负整数的各个位上的数字之和
    public static void main_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = sc.nextInt();
        System.out.println(sumNum(ret));
    }

    public static int sumNum(int n){
        if(n < 10){
            return n;
        }else{
            return n%10 + sumNum(n/10);
        }
    }

    //模拟实现Arrays.ToString()方法  ——  将数组元素转换成字符串。
    public static void main_3(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(myToString(array));
    }

    public static String myToString(int[] array) {
        if(array.length == 0) return "-1";
        if(array == null) return "null";
        String str = "[";
        int i = 0;
        for ( i = 0; i < array.length; i++) {
            if(i != array.length - 1){
                str += array[i] + ",";
            }
        }
        str += array[i];
        str += "]";
        return str;
    }

    public static void main_2(String[] args) {
        int[] arr = {1,2,3,4};
        double b = Math.pow(2,3);
        Arrays.toString(arr);
    }

    public static void main_1(String[] args) {
        func();
    }
    public static void func(){
        func();
        //StackOverflowError:栈溢出错误
    }
}
