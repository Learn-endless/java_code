package com.bit.testdemo1;
/**
 * @author Administrator
 * 性别：不是男就是女
 * 年龄：不要未成年和已退休的人
 * 薪资：不能低于政府最低标准
 * 
 * 使用多层catch块进行多次捕获
 */
public class Employee {
	private String name;
	private String sex;
	private int age;
	private double money;
	
	public String getName(){
		return name;
	}
	
	//设置员工姓名
	public void setName(String name) throws NameNullException{
		//当姓名为空时，抛异常
		if(name == null || name.equals("")){
			throw new NameNullException("姓名不能为空！");
		}
		this.name = name;
	}

	public String getSex() {
		return sex;
	}
	//设置员工性别
	public void setSex(String sex) throws SexException {
		if((sex.equals("男")||sex.equals("女")) == false){
			throw new SexException("无法识别是 男 还是 女！");
		}
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}
	//设置员工年龄
	public void setAge(int age) throws AgeException {
		if(age < 18 || age > 60){
			throw new AgeException("应聘人员可能是未成年和老年人！");
		}
		this.age = age;
	}

	public double getMoney() {
		return money;
	}
	//设置员工工资
	public void setMoney(double money) throws MoneyException {
		if(money < 4000){
			throw new MoneyException("工资低于政府要求的最低标准！");
		}
		this.money = money;
	}
	
	
}
