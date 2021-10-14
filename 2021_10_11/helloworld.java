public class helloworld{  //注意通常一个类一个源文件
                          //并且类名应与文件名相同
    public static void main(String[] args) {
    	int a = 10;
    	int b = 3;
    	System.out.println(a/b);
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(Integer.MIN_VALUE);
    	int c = Integer.MAX_VALUE + 1;
    	int d = Integer.MIN_VALUE - 1;
    	System.out.println(c);
    	System.out.println(d);
    	long e = 10L;
    	System.out.println(e);
    	byte f = 65;      //byte类型是整数
    	System.out.printf("%c\n",f);
    	byte h = 'A';     //一个字节
    	System.out.println(h);
    	char m = 65;     //两个字节大小
    	System.out.println(m);
    }
    //书写main方法
    public static void func(String[]args){  
    	for (int i = 0; i < args.length; i++){
    		System.out.println(args[i]);
    	}

    	/*
    	//段注释
    	//换行打印hello world
    	System.out.println("hello world");
    	//不换行打印hello world
    	System.out.print("hello world");
    	//格式化打印
    	System.out.printf("%d\n",10);
    	*/
    }
    void fun(){
    	//方法要写在类的里面
    }
}
/**
 * 文档注释
 * 1.
 * 2.
 * 3.
 * 4.
 * ...
 */

public class helloworld{
	public static void main(String[] args) {
		/**
		 * 这是一个文档注释！
		 * 一般放于类或者方法前面，说明类或者方法的作用。
		 * 1.
		 * 2.
		 * 3.
		 * 4.
		 * ...
		 */

		System.out.println("这时一个测试");
		
	}
}