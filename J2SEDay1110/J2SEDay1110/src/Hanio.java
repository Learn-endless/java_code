
public class Hanio {

	//移动方法
	public void move(int n,char a,char b) {
		System.out.println("将第"+n+"个盘子从"+a+"柱移动到"+b+"柱");
	}
	/**
	 * @param n  盘子的个数
	 * @param a  盘子移动起始的柱子
	 * @param b  移动需要借助的柱子
	 * @param c  盘子移动结束的柱子
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
		// TODO 自动生成的方法存根
		Hanio hanio = new Hanio();
		int n = 8;
		char a = 'A',b = 'B',c = 'C';
		hanio.hanio(n, a, b, c);
	}

}
