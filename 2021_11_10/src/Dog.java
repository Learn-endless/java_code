/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-06
 * Time:  15:43
 */
public class Dog {
    //成员变量(又叫属性，字段)：表示对象的特征
    private String name;     //名字
    private int age;         //年龄

    //由于name和age被private(私有化),这样就不能再类外使用它，所以这里写四个公共接口
    //获取这个对象的name和age
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
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
