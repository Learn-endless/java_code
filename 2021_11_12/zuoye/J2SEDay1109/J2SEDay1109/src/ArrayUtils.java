import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�������򷽷���sortϵ��,��java.util.Arrays,Ĭ������������(��С����)
		/*int[] arr = {2,3,9,-45,1,8,2};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}*/
		//binarySearch���ֲ��ҷ������������ֵ������������ǰ�������������
		int[] arr1 = {9,3,2,6,1,4};
		System.out.println(Arrays.binarySearch(arr1, 6));
		//���鸴�ƣ�arraycopy
		//public static void arraycopy(Object src,int srcPos,
		//	Object dest,int destPos,int length)
		/*
		 *  src - Դ���顣 
			srcPos - Դ�����е���ʼλ�á� 
			dest - Ŀ�����顣 
			destPos - Ŀ�ĵ������е���ʼλ�á� 
			length - Ҫ���Ƶ�����Ԫ�ص�������
		 * */
		//������Ϊ5���������ݵ�����Ϊ10
		int[] oldArr = {1,2,3,4,5};
		int[] newArr = new int[oldArr.length*2];
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
	}

}
