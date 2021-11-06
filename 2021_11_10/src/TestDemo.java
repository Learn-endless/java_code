/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-06
 * Time:  15:42
 */
public class TestDemo {
    /**
     * 从下面的代码中，可以看到，我先定义了一个Dog类，然后用这个类（模板）实例化了两个对象：
     * 小黄和小黑
     * 它们都有属于它们name和age属性（成员变量）
     * 同时，它们也都有自己的行为（方法）
     *
     * @param args
     */
    public static void main(String[] args) {

        //new一个对象（实例化对象）
        Dog dog1 = new Dog();
        //我们为它取一个属于它的名字，并记录它的年龄。
        dog1.setName("大黄");
        dog1.setAge(8);
        //调用对象的行为，看看它在做什么。
        dog1.eat();
        dog1.sleep();

        //又重新new一个新对象（实例化对象）
        Dog dog2 = new Dog();
        //我们也为它取一个属于它的名字，并记录它的年龄。
        dog2.setName("小黑");
        dog2.setAge(2);
        //同样调用对象的行为，看看它在做什么。
        dog2.eat();
        dog2.sleep();
    }
}
