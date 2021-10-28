import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-28
 * Time:  8:36
 */
public class Test {
    /**
     * 自定义拷贝函数
     * @param array 一组数
     * @return 返回一个全新的数组
     */
    public static int[] arrayCopy(int[] array){
        int[] temp =new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }

    //数组的拷贝
    public static void main_2(String[] args) {
        /**
         * 浅拷贝与深拷贝
         * 具体的实现是看个人的代码
         * 不能笼统的说以下的四种方法是深拷贝或浅拷贝
         * 深拷贝：拷贝对象
         * 浅拷贝：拷贝引用
         */
        int[] array = {1,2,3,4,5};
        //自定义拷贝方法
//        int[] ret = arrayCopy(array);
//        System.out.println(Arrays.toString(ret));
        //使用Arrays.copyOf方法
        int[] ret = Arrays.copyOf(array,array.length*2);
        System.out.println(Arrays.toString(ret));
//        //使用Arrays.copyOfRange方法
//        ret = Arrays.copyOfRange(array,1,3);   //拷贝范围：[1,3)
//        System.out.println(Arrays.toString(ret));
//        //使用System.arraycopy方法
//        int[] temp = new int[array.length];
//        System.arraycopy(array,0,temp,0,array.length);
//        System.out.println(Arrays.toString(temp));
        //数组名.clone产生一个副本
        int[] copy = array.clone();
        copy[0] = 10;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));

    }

    //优化冒泡排序
    //第一遍排序，第二遍检查是否有序（无序，继续排）
    public static void main_1(String[] args) {
        int[] array = {1,2,4,3,5,6,7};
       /* int count = 0;   //统计循环的次数
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;   //用来标记数组在排序的过程中是否已经有序
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            count++;
            if(flag){   //判断是否已进有序
                break;
            }*/
        Arrays.sort(array);   //自带的快排序
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,99);  //填充，数组的所用元素填充为val值
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,1,3,199); //选择部分进行填充，区间[1,3)下标
        System.out.println(Arrays.toString(array));
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(count+"趟排序");
    }
}
