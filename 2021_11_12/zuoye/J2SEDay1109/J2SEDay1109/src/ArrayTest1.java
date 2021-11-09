public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 数组的声明：数组数据类型[] 数组名称;
		 * 		int arr[];
		 * 		int[] arr;推荐使用这种格式
		 * 数组的赋值(创建)：
		 * 		1.int[] arr1 = new int[5];推荐使用
		 * 		2.int[] arr2 = new int[]{2,5,1,-3,6};
		 * 		3.int[] arr3 = {2,5,1,-3,6};推荐使用
		 * 
		 * 注意点：
		 * 1.使用new创建数组时必须指定数组长度(大小)
		 * 2.使用直接赋值操作创建数组时不能指定数组长度(大小)
		 * 
		 * 数组的使用：对数组中的数据进行赋值或获取，使用索引来操作，索引[]
		 * 		索引：数组索引从0开始，
		 * 		长度：length数组属性，指明数组的大小
		 * 
		 * */
		int[] arr = new int[5];//开辟空间，赋值都为0
//		int[] arr2 = new int[]{2,5,1,-3,6};
//		int[] arr3 = {2,5,1,-3,6};
		//数组的大小:length
		System.out.println("数组的大小为："+arr.length);
		System.out.println(arr);
		//数组数据赋值
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 6;
		arr[4] = 9;//arr.length-1
		//数组数据的获取
		System.out.println("数组中第一个数据为："+arr[2]);
		//数组的循环遍历（正序）
		System.out.println("正序遍历:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("倒序遍历:");
		//倒序遍历
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		//增强for循环
		/*
		 * for(数据类型 名称:数组名称){
		 * 		System.out.print(名称);
		 * }
		 * 
		 * 在使用条件进行循环遍历时会比较麻烦
		 * */
		for(int a:arr) {
			System.out.print(a+" ");
		}
		//数组中常见异常
		//ArrayIndexOutOfBoundsException数组下标越界
//		System.out.println(arr[6]);
		//NullPointerException空指针异常
		int[] arr1 = null;
		System.out.println(arr1.length);
	}

}
