package myproject;
public class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new InvalidSideLengthException("无效的边长");
		}
		if (a + b > c && a + c > b && b + c > a) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new CannotFromATriangleException("不是一个三角形");
		}
	}
	public String judgmentType() {
		if(a==b && b==c) {
			return "等边三角形";
		}else if(a==b || b==c || a==c) {
			return "等腰三角形";
		}else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
			return "直角三角形";
		}else {
			return "普通三角形";
		}
	}
	/**
	 * 计算周长
	 * @return
	 */
	public int girth() {
		return a+b+c;
	}
	/**
	 * 计算面积
	 * @return
	 */
	public double area() {
		int p=girth()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
