
public class StudentTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student student = new Student();
//		System.out.println(student.name);
		//对属性进行赋值
		student.setName("学生1");
		//获取属性的值
		String name = student.getName();
		System.out.println("学生的姓名："+name);
	}

}
