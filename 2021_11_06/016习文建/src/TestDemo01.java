import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

class Dog{
    //成员变量(又叫属性，字段)：表示对象的特征
    private String name;     //叫什么名字
    private int age;

    //由于name和age被private(私有化),这样就不能再类外使用它，所以这里写两个公共接口
    //获取这个对象的name和age
    public String getName() {
        return name;
    }
    public int getAge() {

        return age;
    }
    //由于name和age被private(私有化)，这样就不能再类外使用它，所以这里写两个公共接口
    //设置对象的name和age
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //方法:表示对象的行为
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
    public void sleep(){
        System.out.println(name+"已经"+age+"岁了，它正在睡觉");
    }
}

public class TestDemo01 {
    /**
     * 从下面的代码中，可以看到，我先定义了一个Dog类，然后用这个类（模板）实例化了两个对象：
     * 小黄和小黑
     * 它们都有属于它们name和age属性（成员变量）
     * 同时，它们也都有自己的行为（方法）
     * @param args
     */
    public static void main(String[] args) {
        //new一个对象（实例化对象）
        Dog dog1= new Dog();
        //我们为它取一个属于它的名字，并记录它的年龄。
        dog1.setName("大黄");
        dog1.setAge(8);
        //调用对象的行为，看看它在做什么。
        dog1.eat();
        dog1.sleep();

        //又重新new一个新对象（实例化对象）
        Dog dog2= new Dog();
        //我们也为它取一个属于它的名字，并记录它的年龄。
        dog2.setName("小黑");
        dog2.setAge(2);
        //同样调用对象的行为，看看它在做什么。
        dog2.eat();
        dog2.sleep();
    }

//    //会员服务：
//    public static void main_7(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入是否是会员：(0-是，1-否)");
//        int num = sc.nextInt();
//        System.out.println("请输入购物金额：");
//        double money = sc.nextDouble();
//        double total = 0.0;    //存放实际支付金额
//        if(num == 0){
//            if(money >= 200){ //会员并消费满200
//                total = money * 0.75;
//            }else {           //会员消费不满200
//                total = money * 0.8;
//            }
//        }else{
//            if(money >= 100){ //普通客人消费满100
//                total = money * 0.9;
//            }
//        }
//        System.out.println("实际支付："+total);
//    }
//
//    //打印三个数中的最大值
//    public static void main_6(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = a>b?a:b;
//        max = max>c?max:c;
//        System.out.println("最大的数是："+max);
//    }
//
//    //求num的自增自减后的值：
//    public static void main_5(String[] args) {
//        int num = 5;
//        num = num++ + ++num + --num + num--;
//        System.out.println(num);
//
//    }
//
//    //存储以下变量信息，并且打印出来
//    public static void main_4(String[] args) {
//        String brand = "爱国者F928";
//        double weight = 12.4;
//        String type = "内置锂电池";
//        int price = 499;
//        System.out.println("品牌："+brand);
//        System.out.println("重量："+weight);
//        System.out.println("电池类型："+type);
//        System.out.println("价格："+price);
//    }
//
//    //判断是否为闰年
//    public static void main_3(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一个年份：");
//        int year = sc.nextInt();
//        if(year%4==0 && year%100!=0 || year%400==0){
//            System.out.println(year+"是闰年");
//        }else{
//            System.out.println("不是闰年");
//        }
//    }
//
//    //顺序结构
//    public static void main_2(String[] args) {
//        int javaScore = 99;
//        int musicScore = 85;
//        if(javaScore>98 && musicScore>80){
//            System.out.println("老师奖励他");
//        }else if(javaScore == 100 && musicScore > 70){
//            System.out.println("老师奖励他");
//        }else{
//            System.out.println("不配领奖励");
//        }
//    }
//
//    //1.从控制台输入三门课的成绩
//    public static void main_1(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入三门课的成绩：");
//        System.out.print("Java课的成绩为：");
//        double class1 = sc.nextDouble();
//        System.out.print("SQL课的成绩为：");
//        double class2 = sc.nextDouble();
//        System.out.print("html课程的成绩为：");
//        double class3 = sc.nextDouble();
//        System.out.println("Java\tSQL\t\tHtml");
//        System.out.println(class1+"\t"+class2+"\t"+class3);
//        System.out.println("java和SQL的分数只差为："+(class1>class2?class1-class2:class2-class1));
//        System.out.println("三门课程的平均分为："+(class1+class2+class3)/3.0);
//    }
}
