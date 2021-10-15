public class code{
	public static void main(String[]args){
		long b = 1.8;   //会报错
		long a = (long)1.8;
		System.out.println(a);

	}
		public static void main_7(String[]args){
		float inputNumber = 0;
		double a = 3.14;  //默认的是double类型的数
		System.out.println(a);
		System.out.println(Double.MAX_VALUE); //最大存储数据
		System.out.println(Double.MIN_VALUE); //最小存储数据
	}

	public static void main_6(String[]args){
		float a = 3.14f;  //加 f/F 表示float类型的数
		System.out.println(a);
		System.out.println(Float.MAX_VALUE); //最大存储数据
		System.out.println(Float.MIN_VALUE); //最小存储数据
	}

	public static void main_5(String[]args){
		long a = 10L;
		System.out.println(a);
		System.out.println(Long.MAX_VALUE);  //最大值
		System.out.println(Long.MIN_VALUE);  //最小值
	}

	public static void main_4(String[]args){
		int a = 10;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE); //最大能存储的数据
		System.out.println(Integer.MIN_VALUE); //最小能存储的数据

	}

	public static void main_3(String[]args){
		short a = 10;
		System.out.println(a);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}

	public static void main_2(String[]args){
		char a = 97;
		System.out.println(a);
		char b = 'a';
		System.out.println(b);
	}

	public static void main_1(String[]args){
		byte a = 'a';    //a的ASCII码为97
		System.out.println(a);
		System.out.printf("%c\n",a);  //以字符的形式打印

		//打印byte中能存储的最大数据
		System.out.println(Byte.MAX_VALUE);
		//打印byte中能存储的最小数据
		System.out.println(Byte.MIN_VALUE);
	}
}