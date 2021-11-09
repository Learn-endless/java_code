import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//1.键盘输入5个数据的值，并将其存入数组，在进行遍历打印
		//2.控制台输入一个数据，判断其是否在数组中？
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个数：");
			arr[i] = scanner.nextInt();
		}
		//数组遍历
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		//循环标识符
		boolean flag = false;
		for (int i : arr) {
			if(num == i) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("没找到！");
		}else {
			System.out.println("找到了！");
		}
	}

}
