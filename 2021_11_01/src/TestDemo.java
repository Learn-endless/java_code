import java.util.Arrays;

public class TestDemo {

    //特殊的二维数组
    public static void main(String[] args) {
        int[][] array = {{1,2},{4,5,6}};   //不够的并不会补0
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {    //每个元素又是一个一维数组，这里求了一维数组的元素个数
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        System.out.println(Arrays.deepToString(array));
        System.out.println("=====================================");

        //在Java中二维数组创建时，必须要指定行的数量，列可以不指定
        int[][] array1 = new int[2][];  //这种写法相当于一个一维数组里面有两个元素，每个元素又是一个一维数组，但元素内容为null
        System.out.println(Arrays.deepToString(array1));
        System.out.println("=====================================");
        //但是我们可以给它的元素分别重新new一个
        array1[0] = new int[2];
        array1[1] = new int[3];
        System.out.println(Arrays.deepToString(array1));
        /**
         * 这种每一行不确定列的二维数组叫：不规则的二维数组
         */
    }

    //二维数组遍历 —— 可以看成一个特殊的一维数组
    public static void main_2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        //用for循环
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=============================");
        for (int[] ret:array) {
            for (int x:ret) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    //二维数组的创建
    public static void main_1(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));
    }
}
