public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * �����������������������[] ��������;
		 * 		int arr[];
		 * 		int[] arr;�Ƽ�ʹ�����ָ�ʽ
		 * ����ĸ�ֵ(����)��
		 * 		1.int[] arr1 = new int[5];�Ƽ�ʹ��
		 * 		2.int[] arr2 = new int[]{2,5,1,-3,6};
		 * 		3.int[] arr3 = {2,5,1,-3,6};�Ƽ�ʹ��
		 * 
		 * ע��㣺
		 * 1.ʹ��new��������ʱ����ָ�����鳤��(��С)
		 * 2.ʹ��ֱ�Ӹ�ֵ������������ʱ����ָ�����鳤��(��С)
		 * 
		 * �����ʹ�ã��������е����ݽ��и�ֵ���ȡ��ʹ������������������[]
		 * 		����������������0��ʼ��
		 * 		���ȣ�length�������ԣ�ָ������Ĵ�С
		 * 
		 * */
		int[] arr = new int[5];//���ٿռ䣬��ֵ��Ϊ0
//		int[] arr2 = new int[]{2,5,1,-3,6};
//		int[] arr3 = {2,5,1,-3,6};
		//����Ĵ�С:length
		System.out.println("����Ĵ�СΪ��"+arr.length);
		System.out.println(arr);
		//�������ݸ�ֵ
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 6;
		arr[4] = 9;//arr.length-1
		//�������ݵĻ�ȡ
		System.out.println("�����е�һ������Ϊ��"+arr[2]);
		//�����ѭ������������
		System.out.println("�������:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("�������:");
		//�������
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		//��ǿforѭ��
		/*
		 * for(�������� ����:��������){
		 * 		System.out.print(����);
		 * }
		 * 
		 * ��ʹ����������ѭ������ʱ��Ƚ��鷳
		 * */
		for(int a:arr) {
			System.out.print(a+" ");
		}
		//�����г����쳣
		//ArrayIndexOutOfBoundsException�����±�Խ��
//		System.out.println(arr[6]);
		//NullPointerException��ָ���쳣
		int[] arr1 = null;
		System.out.println(arr1.length);
	}

}
