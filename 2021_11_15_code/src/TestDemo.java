//import com.bit.TestDemo.TestDemo;

class person{

}
public class TestDemo {
    public String name;
    public int age;
    public static void main(String[] args) {
        com.bit.TestDemo.TestDemo testDemo = new com.bit.TestDemo.TestDemo();
        System.out.println(testDemo.val);
    }

    public TestDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestDemo() {
    }
}
