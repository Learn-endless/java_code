import java.util.Arrays;
import java.util.Scanner;

public class Test {

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,3,4,5};
        System.out.println("输入："+Arrays.toString(array));
        System.out.println("输出："+findSingle(array));
    }

    /**
     * 求一组数中得单身狗
     * @param array 一组数
     * @return 返回单身狗
     */
    public static int findSingle(int[] array){
        int ret = array[0];
        for (int i = 1; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }

    //实现一个方法 toString, 把一个整型数组转换成字符串.
    // 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static void main_10(String[] args) {
        int[] array = {1,2,3,4,5,6};
        String ret = toString(array);
        if(ret.equals("null")){
            System.out.println("空引用！！！");
            return;
        }
        System.out.println(ret);
    }

    /**
     * 实现自己的方法 —— 将一个整数数组转换成字符串
     * @param array
     * @return
     */
    public static String toString(int[] array){
        if(array == null) return "null";
        String str = "[";
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if(i != array.length - 1){
                str += array[i] + ",";
            }else{
                break;
            }
        }
        str += array[i];
        str += "]";
        return str;
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static void main_9(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ret = copyOf(array);
        System.out.println(Arrays.toString(ret));
    }

    /**
     * 对一个整形数组进行拷贝，返回一个新的数组
     * @param array 原数组
     * @return  新数组
     */
    public static int[] copyOf(int[] array){
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }

    //给定一个有序整型数组, 实现二分查找
    public static void main_8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int ret = binarySearch(array,n);
        if(ret != -1){
            System.out.println("找到了，下标为："+ ret);
        }else{
            System.out.println("查无此数！！！");
        }
    }

    /**
     * 在一个有序数组中查找一个数
     * @param array 一个有序数组
     * @param n 查找的数
     * @return 如果找到，返回下标，没有，返回-1
     */
    public static int binarySearch(int[] array, int n){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(array[mid] > n){
                right = mid - 1;
            }else if(array[mid] < n){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static void main_7(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int flag = 1; //表示有序
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                flag = 0;  //无序
                break;
            }
        }
        if(flag == 1){
            System.out.println("有序(递增)");
        }else{
            System.out.println("无序(递增)");
        }
    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main_6(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,10};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main_5(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        for (int n:array) {
            System.out.print(n+" ");
        }
    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void main_4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        printArray(array);
    }

    /**
     * 打印数组中的元素
     * @param array 存放的数组
     */
    public static void printArray(int[] array){
        for (int n:array) {
            System.out.print(n+" ");
        }
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
    // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void main_3(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(transform(array)));
    }

    /**
     * 将一个数组中得元素扩大2倍
     * @param array 存放一组数
     * @return 返回扩大后的数组
     */
    public static int[] transform(int[] array){
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i]*2;
        }
        return ret;
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static void main_2(String[] args) {
        int[] array = { 1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(array));
    }

    /**
     * 求一组数之和
     * @param array 存放一组数
     * @return 返回和
     */
    public static int sum(int[] array){
        int sum = 0;
        for (int n:array) {
            sum+=n;
        }
        return sum;
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static void main_1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(avg(array));
    }

    /**
     * 求一组数的平均值
     * @param array 存放一组数
     * @return 平均值
     */
    public static double avg(int[] array){
        double sum = 0.0;
        for (int n:array) {
            sum+=n;
        }
        return sum/array.length;
    }
}
