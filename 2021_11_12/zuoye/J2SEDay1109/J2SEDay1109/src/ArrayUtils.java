import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//数组排序方法：sort系列,在java.util.Arrays,默认是升序排列(从小到大)
		/*int[] arr = {2,3,9,-45,1,8,2};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}*/
		//binarySearch二分查找法，根据数组的值来查找索引，前提数组必须有序
		int[] arr1 = {9,3,2,6,1,4};
		System.out.println(Arrays.binarySearch(arr1, 6));
		//数组复制：arraycopy
		//public static void arraycopy(Object src,int srcPos,
		//	Object dest,int destPos,int length)
		/*
		 *  src - 源数组。 
			srcPos - 源数组中的起始位置。 
			dest - 目标数组。 
			destPos - 目的地数据中的起始位置。 
			length - 要复制的数组元素的数量。
		 * */
		//将长度为5的数组扩容到长度为10
		int[] oldArr = {1,2,3,4,5};
		int[] newArr = new int[oldArr.length*2];
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
	}

}
