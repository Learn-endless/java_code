import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1.��������5�����ݵ�ֵ��������������飬�ڽ��б�����ӡ
		//2.����̨����һ�����ݣ��ж����Ƿ��������У�
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("�������"+(i+1)+"������");
			arr[i] = scanner.nextInt();
		}
		//�������
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("������һ������");
		int num = scanner.nextInt();
		//ѭ����ʶ��
		boolean flag = false;
		for (int i : arr) {
			if(num == i) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("û�ҵ���");
		}else {
			System.out.println("�ҵ��ˣ�");
		}
	}

}
