package com.j2se.test1;

public class User {
	private String name;
	private String sex;
	private Ticket t;
	
	public User() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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

	//��Ʊ
//	public void setT(Ticket[] t) {
//		if(t.isTicketState()) {
//			this.t = t;
//			print();
//			return;
//		}
//		System.out.println("û���򵽳�Ʊ");
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
				System.out.println(this.name+"û���򵽵�"+this.t.getTicketName()+"���ε�Ʊ������" );
			}
			System.out.println("-------------------");
		}
	}
	
	public void print() {
		System.out.println("������"+this.name);
		System.out.println("�Ա�"+this.sex);
		System.out.println("���Σ�"+this.t.getTicketName());
		System.out.println("�۸�"+this.t.getTicketPrice());
	}
}
