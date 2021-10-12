public class helloworld{  //注意通常一个类一个源文件
                          //并且类名应与文件名相同
    //书写main方法
    public static void main(String[]args){
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

}