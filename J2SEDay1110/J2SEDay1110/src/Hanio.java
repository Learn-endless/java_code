
public class Hanio {

	//�ƶ�����
	public void move(int n,char a,char b) {
		System.out.println("����"+n+"�����Ӵ�"+a+"���ƶ���"+b+"��");
	}
	/**
	 * @param n  ���ӵĸ���
	 * @param a  �����ƶ���ʼ������
	 * @param b  �ƶ���Ҫ����������
	 * @param c  �����ƶ�����������
	 */
	public void hanio(int n,char a,char b,char c) {
		if(n==1) {
			move(1, a, c);
		}else {
			hanio(n-1, a, c, b);
			move(n, a, c);
			hanio(n-1, b, a, c);
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Hanio hanio = new Hanio();
		int n = 8;
		char a = 'A',b = 'B',c = 'C';
		hanio.hanio(n, a, b, c);
	}

}
