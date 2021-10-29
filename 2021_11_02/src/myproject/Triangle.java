package myproject;
public class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new InvalidSideLengthException("��Ч�ı߳�");
		}
		if (a + b > c && a + c > b && b + c > a) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new CannotFromATriangleException("����һ��������");
		}
	}
	public String judgmentType() {
		if(a==b && b==c) {
			return "�ȱ�������";
		}else if(a==b || b==c || a==c) {
			return "����������";
		}else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
			return "ֱ��������";
		}else {
			return "��ͨ������";
		}
	}
	/**
	 * �����ܳ�
	 * @return
	 */
	public int girth() {
		return a+b+c;
	}
	/**
	 * �������
	 * @return
	 */
	public double area() {
		int p=girth()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
