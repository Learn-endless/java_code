public class TestDemo {
    public static void main(String[] args) {
        int $Usdollars = 10;
        System.out.println($Usdollars);
        short a =128;  //127 + 1,抽象概念：一个圆
        byte b =(byte)a;
        System.out.println(a);
        System.out.println(b); //最大值 + 1 == 最小值  ；  最小值 - 1 = 最大值
        double x=2.0;
        int y=4;
        x/=++y;
        System.out.println(x);
        System.out.println("\\\"hello\\\"");
    }

    public static void main_15(String[] args) {
        //移位运算符  << >> >>>
        //java中 >> 是算术右移 —— 高位补0
        //       << 和C语言是一样的，统统补0
        //注意在 java 中还引入了一个移位运算符：
        // >>> (无符号右移) 这个其实跟C语言中的逻辑右移是一样的，任何情况，高位补0

        //三目运算符 ： 表达式1 ? 表达式2 : 表达式3
        //注意：表达式1的值为 boolean 类型。

    }


    public static void main_14(String[] args) {
        int a = 10;
        int b = 20;
        //关系运算符的表达式返回值都是 boolean 类型。
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        // && || ！
        //逻辑运算符的操作数(操作数往往是关系运算符的结果)和返回值都是 boolean 类型。
        //短路：例：表达式1 && 表达式2 ，如果表达式1为假，表达式2不执行，同理 || 也是一样，表达式1为真，表达式2不执行
        //同样 if 判断的括号里也只能是 boolean 类型的值。
        //if(boolean类型的值)

        // !后面只能接 boolean 类型的值
        System.out.println(!(10<20));
        System.out.println(!!(10<20));


        // &；按位与
        // |：按位或
        // 当它们的操作数是 boolean 类型时，也可以用来进行逻辑运算，只是不支持 短路。

    }

    public static void main_13(String[] args) {
        int a = 9;
        a += 1;   //等价于 a = a + 1;
        System.out.println(a);

        short b = 9;
        b += 1;   //等价于 b = (short)(b + 1)
        System.out.println(b);
        //总结：在java中这种增量赋值运算符可以帮我们完成强制类型转换。

        //System.out.println(20/0);  //除法中两个操作数都为整数时，除数不能为0
        //System.out.println(20%0);  //取模操作符中两个操作数都为整数时，除数不能为0
        System.out.println(20.0%0);  //NaN ：Not a Number
        System.out.println(20.0%0.0);//NaN
        System.out.println(20%0.0);  //NaN
        System.out.println(20.0/0);  //Infinity:正无穷
        System.out.println(20.0/0.0);//Infinity
        System.out.println(20/0.0);  //Infinity
        System.out.println(-20/0.0); //-Infinity：负无穷
        System.out.println(-20%0.0); //NaN

        //总结：遵循IEEE 754标准用三个特殊的值表示溢出和出错的情况
        // Infinity:正无穷
        // -Infinity:负无穷
        // NaN：Not a Number

    }

    public static void main_12(String[] args) {
        //在java中取模操作符的操作数可以是小数
        int a = 10;
        double b = 4.5;
        System.out.println(a%b);   //1.0
        System.out.println(10%-3); //1
        System.out.println(-10%3); //-1
        System.out.println(-10%-3);//-1
    }

    int a;     //成员变量，有默认值
    public static void main_11(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(a/b);  //抛出异常(报错)：java 中的除法，除数不能为0
        //在java中一旦程序抛出异常(报错)，程序就会在该异常处停止，并报错
        System.out.println("hehheheheh");
        // ArithmeticException : / by zero at TestDemo.main(TestDemo.java:6)
        //解释:什么类型的异常(算术异常) 原因(除数为0) 哪里(TestDemo类里的main方法中的第6行)
    }

    public static void main_10(String[] args) {
        char a = 97;
        System.out.println(a);
        char b = 'a';
        System.out.println(b);

        //char类型能存放的最大值和最小值
        //注意char的包装类Character中的MAX_VALUE和MIN_VALUE是字符类型。
        //直接打印就是字符，所以需要强转后，再来打印。
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);

    }

    public static void main_9(String[] args) {
        String num = "123";
        //Integet类中的valueOf方法 —— 将字符串转化为整数
        int ret = Integer.valueOf(num);
        System.out.println(ret);
    }

    public static void main_8(String[] args) {
        int num = 10;
        //String类中的valueOf方法 —— 将整形转化为字符串
        String ret = String.valueOf(num);
        System.out.println(ret);
    }

    public static void main_7(String[] args) {
        byte a = 1;
        byte b = 2;
        byte c = (byte)(a + b);   //报错，这里会进行整形提升，结果为 int 类型，范围大的不能赋值给小的，需加强转类型。
        System.out.println(c);

        byte d = 1 + 2;       //不报错,编译阶段就确定其值，小于byte类型的最大存储范围。
        System.out.println(d);

        //byte e = 100 + 30;    //报错：编译阶段发现超出byte类型的存储范围。
        //System.out.println(e);
    }

    public static void main_6(String[] args) {
        boolean m = true;
        boolean n = false;
        System.out.println(m);
        System.out.println(n);

        int a = 10;
        //boolean b = (boolean) a;
        //强转都不行，这两个压根儿就不是一种东西，boolean类型根本就不是数值类型。

        //同理：
        boolean c = true;
        //int d = (int)c;
        //这个也是不行的，理由同上。
    }

    public static void main_5(String[] args) {
        //以下这样赋值是支持的，小类型赋值给大类型没问题。
        int a = 10;
        long b = a;
        System.out.println(b);

        //这种是不行的
        long c = 1111212122124542110L;
        //int d = c;      //报错
        //为什么？
        //因为变量在程序运行的时候，才知道值的大小，而编译器报错是在编译阶段，这时编译器根本不知道变量c的大小是多少。

        int d = (int)c;  //这种加上强转的是可以赋值的。 —— 但是注意这种是有风险的，就像这里d明显放不下c的内容。

        //总结：java是一门强类型语言，C语言是一门弱类型语言。
        //不同数字类型的变量之间赋值, 表示范围更小的类型能隐式转换成范围较大的类型, 反之则不行
        //例如int、float、byte、char、long 都能给 double
        //但是boolea这种类型不能进行强制类型转换，它压根儿就不是数值类型。


    }

    public static void main_4(String[] args) {
        // 变量：在程序运行的过程中，才可以知道的值，并且可以改变的量。
        // 常量：在程序运行的过程中，不可以修改的量，并且在程序编译的时候就已经有确定的值了。
        //      1.字面值常量：1, 3.14， “hello world”, ...
        //      2.final修饰的常量(这个跟C语言中的const关键字有点像)：所修饰的变量将不能被修改。
        //例：
        final int A = 10;          //定义常量时，最好全大写
        //A = 20;    //报错，不能修改

        //这样进行初始化也是可以的。
        final int MAX ;
        MAX = 200;
        System.out.println(MAX);
    }


    //定义在一个类里面，方法外面的变量加成员变量
    //成员变量又分为： 1.普通成员变量.     2.静态成员变量

    public static void main_3(String[] args) {
/*        {
            int a = 10;   // a的作用域在花括号内
        }
        System.out.println(a);   //变量a已经出了作用域，程序报错。*/

        //在java中只有8中基本类型才有对应的包装类
        //比如 int 的包装类 Integer 可以看成 int 的 plus 版本
        //或者可以看成 Integer 这种数据类型，它是一个类

    }

    public static void main_2(String[] args) {
        //字符串类型
        String value = "hello";
        System.out.println(value);

        System.out.println(value + "world");      //两个字符串相加 —— 字符串拼接
        System.out.println(value + 10 + 20);      //其他类型数据 + 字符串 = 结果为一个字符串
        System.out.println(10 + 20 + value);      //注意这里 10 和 20 先相加， 后与字符串相加
        System.out.println(value + (10 + 20));    //hello30
        System.out.println(10 + "" + 20 +value);  //1020hello
        System.out.println("true"+" false");

        //a = 10, b = 20
        System.out.println("a = " + 10 + ", b = " + 20);   //比较实用

        String s1 = "\"bit\"";  //转义字符的使用
        System.out.println(s1);
    }

    public static void main_1(String[] args) {

        //System.out.println("hello world!");
        boolean a = true;   //boolean 类型只有两个值：true 和 false ，不存在 非0 真，0为假的情况
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
        /*
        有些书中说布尔类型的大小是1个比特位或者是1个字节。
        但在JVM规范中并没有规定布尔类型的大小。
        遇到这种题，看看有没有明确是错的三个选项 —— 排除法 。
        或者不选！！！
         */

        /*两种写法都是错的
        System.out.println(true + 1);
        System.out.println(a + 1);
        */

    }
}
