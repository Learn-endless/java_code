
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ��ά���飺
		 * 		������int[][] arr;
		 * 		������
		 * 
		 * 
		 * 
		 * 
		 * */
		//1.ָ������:����ָ��һά����
		int[][] arr1 = new int[3][2];
		//2.ֱ�Ӹ�ֵ
		int[][] arr2 = new int[][] {{1,2,3},{3,4},{5}};
		//3.ֱ�Ӹ�ֵ(����new)
		int[][] arr3 = {{1,2,2},{8,4},{6}};
		//��ά����ĳ���:lengthָ����һά���ȣ������һά����Ĵ�С
		System.out.println(arr1.length);
		//��ά����ı�������ͨfor��
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		System.out.println();
		//��ǿforѭ��
		for(int[] num:arr3) {
			for(int a:num) {
				System.out.print(a+" ");
			}
		}
	}

}
