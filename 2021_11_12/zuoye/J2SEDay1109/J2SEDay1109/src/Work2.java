
public class Work2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ԭ�������ظ�������ȥ��������ʣ������ݴ���һ���µ�����
		int[] oldArr = {1,2,2,3,4,4,5,6,7,7,8};
		int k = 0;
		int[] temp = new int[oldArr.length];
		for(int i=0;i<oldArr.length;i++) {
			boolean flag = true;
			for(int j=i+1;j<oldArr.length;j++) {
				//�ظ���
				if(oldArr[i]==oldArr[j]) {
					flag = false;
					break;
				}
			}
			//����flagֵ������������
			if(flag) {
				temp[k] = oldArr[i];
				k++;
			}
		}
		//����temp����
		/*for (int i : temp) {
			System.out.print(i+" ");
		}*/
		int[] newArr = new int[k];
		System.arraycopy(temp, 0, newArr, 0, k);
		System.out.println();
		//����������
		for (int i : newArr) {
			System.out.print(i+" ");
		}
	}
}
