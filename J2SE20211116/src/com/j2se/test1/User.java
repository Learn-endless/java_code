package com.j2se.test1;

public class User {
	private String name;
	private String sex;
	private Ticket t;
	
	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

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

	public Ticket getT() {
		return t;
	}

	//买票
//	public void setT(Ticket[] t) {
//		if(t.isTicketState()) {
//			this.t = t;
//			print();
//			return;
//		}
//		System.out.println("没有买到车票");
//	}
	
	public void setT(Ticket[] t) {
		int count = 0;
		for(Ticket m:t){
			if(count==3) {
				return;
			}
			if(m.isTicketState()) {
				this.t = m;
				print();
				count++;
				
			}else{
				this.t = m;
				System.out.println(this.name+"没有买到第"+this.t.getTicketName()+"车次的票》》》" );
			}
			System.out.println("-------------------");
		}
	}
	
	public void print() {
		System.out.println("姓名："+this.name);
		System.out.println("性别："+this.sex);
		System.out.println("车次："+this.t.getTicketName());
		System.out.println("价格："+this.t.getTicketPrice());
	}
}
