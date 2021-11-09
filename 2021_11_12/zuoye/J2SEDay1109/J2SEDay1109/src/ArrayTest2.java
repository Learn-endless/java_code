
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 二维数组：
		 * 		声明：int[][] arr;
		 * 		创建：
		 * 
		 * 
		 * 
		 * 
		 * */
		//1.指定长度:必须指定一维长度
		int[][] arr1 = new int[3][2];
		//2.直接赋值
		int[][] arr2 = new int[][] {{1,2,3},{3,4},{5}};
		//3.直接赋值(不用new)
		int[][] arr3 = {{1,2,2},{8,4},{6}};
		//二维数组的长度:length指的是一维长度，或包含一维数组的大小
		System.out.println(arr1.length);
		//二维数组的遍历（普通for）
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		System.out.println();
		//增强for循环
		for(int[] num:arr3) {
			for(int a:num) {
				System.out.print(a+" ");
			}
		}
	}

}
