//良好的封装
//属性私有化，方法公有化(需要提供给外界的方法)
public class Student {
	//private修饰的成员变量无法被其他类调用
	private String name;
	private String sex;
	private int age;
	
	public Student() {
		
	}
	public Student(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	//get：获取成员变量，set：对成员变量进行赋值
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
