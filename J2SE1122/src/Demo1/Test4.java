package Demo1;

public class Test4 {
    private String name;
    private static String sname = "我是外部类的静态成员变量。";

    public void method(){
        System.out.println("我是外部类的成员方法！");
        GaoBo gaoBo = new GaoBo();
        System.out.println(gaoBo.age);
        gaoBo.innerMethod();
        GaoBo.staticInnerMethod();
    }
    public static void staticMethod(){
        System.out.println("我是外部类的静态成员方法！");
    }

    public static class GaoBo{
        private int age = 10;
        private static String isName = "我是内部类的静态成员变量";

        public void innerMethod(){
            System.out.println("我是内部类的普通成员方法！");
            System.out.println(sname+" "+isName);
            staticMethod();
        }
        public static void staticInnerMethod(){
            System.out.println("我是内部类的静态成员方法！");
            staticMethod();
        }
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        GaoBo gaoBo = new GaoBo();
        test4.method();
        Test4.staticMethod();
    }
}
