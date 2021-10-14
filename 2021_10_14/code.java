public class code{
	
	//注意在写java代码时，最好一个源文件一个类。
	//类中可以有一个或多个方法。(方法必须写在类中)
	
	public static void main(String[]args){
		short a = 50;  //short类型大小为2个字节
		System.out.println(a);
		
		//注意在除法中，必须要有一个操作数是浮点数，结果才会是浮点数
		int b = 8;
		float c = 3.0f;
		double d = 3.0;
		System.out.println(b/c);
		System.out.println(c/d);
		//两个整数除的话，结果只会取整。
	}

	
	public static void main_6(String[]args){
		//这种类型和C语言中char类型基本一样。
		//大小是1个字节，存放实际上是整数，所以它是属于整形家族的。
		byte b = 10; 
		byte c = -128; //一个字节存放的最小的值。
		byte d = 127; //一个字节存放的最大的值。
		System.out.println(c);
		System.out.println(d);
		
	    //byte n = 129;  //超出范围，会报错.
	    //System.out.println(n);
	}
	
	public static void main_5(String[]args){
		char ch = '钱'; //java中char的内存大小是2个字节大小
		//由于一个中文文字的大小是2个字节，所以char可以存放中文。
		//ASCII码自然也可以存放。
		char ch2 = 97;
		System.out.println(ch);
		System.out.println(ch2);
	}
	
	public static void main_4(String[]args){
		float a = 3.14f; //这里必须加上F/f用来表示是float类型
		//在java中不会发生截断，遇到就直接报错。
		
		System.out.println(a);
	}
	
	public static void main_3(String[]args){
		double a = 10.0;  //java中一个浮点数常量默认是double类型的
		double b = 3;
		System.out.println(b);
	}
	
	public static void main_2(String[]args){
		//注意在java中没有所谓的无符号数。
		long a = 10;   //java里面没有long long这种类型，并且long大小就是8个字节
		//这里在写的时候最好在后面加上 L(大写)这样规范一些。
		System.out.println(a);
		//这里注意Long 和 下面的 Integer 都是java基本类型的包装类
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
	}
	
	public static void main_1(String[]args){
		
		/**
	 	* -----------这是一个文档注释-------------
		* 变量名的命名规则：
		* 1.变量名只能由数字、字母、下划线和美元符号组成。
		* 2.数字不能开头。
		* 3.阿里巴巴的规定：变量不能由下划线或美元符号开头或结尾
		* 4.变量名不能单纯的用下划线或美元符号构成。
		* 5.正确的命名方式为：小驼峰状
		*/
		//变量名正确命名的例子：
		int a3 = 0;   //注意在java中定义变量时不初始化会报错。
	    int maxNum = 10; //英文单词首字母大写（除开头单词之外） 
		int max_num = 10; //不想大写也可以用下划线连接。
		int max3_num = 10;
		int max$num = 10; //一般不要使用美元符号来当变量名。
		//语法支持，但很low的例子：
		int ____ = 10;
		int _______ = 10;
		int _________ = 10;
		int $ = 10;
		int $$ = 10;
		int 钱 = 10;
		
		
		
	    //定义一个整形，四个字节大小，并打印里面所能存放的最大值和最小值
		int i = 0;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//结果和上面的输入作比较
		//了解int型最大值加一的结果
		//了解int型最小值减一的结果
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		//结果：最大值变最小值，最小值变最大值。
		//int型的数据在存储时，可以想象成一个圆。
		
		/*
		for(i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}*/
		
		//使用length循环打印输入的字符串
		/*for(i = 0; i < args.length; i++){
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
		}*/
		
		//打印并换行
      System.out.println("hello world");
	    //打印不换行
	  System.out.print("hello world");
	    //格式化打印数据
	  System.out.printf("%d\n",100);
	  
	}
}