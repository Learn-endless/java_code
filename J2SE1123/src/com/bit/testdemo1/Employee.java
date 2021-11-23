package com.bit.testdemo1;
/**
 * @author Administrator
 * �Ա𣺲����о���Ů
 * ���䣺��Ҫδ����������ݵ���
 * н�ʣ����ܵ���������ͱ�׼
 * 
 * ʹ�ö��catch����ж�β���
 */
public class Employee {
	private String name;
	private String sex;
	private int age;
	private double money;
	
	public String getName(){
		return name;
	}
	
	//����Ա������
	public void setName(String name) throws NameNullException{
		//������Ϊ��ʱ�����쳣
		if(name == null || name.equals("")){
			throw new NameNullException("��������Ϊ�գ�");
		}
		this.name = name;
	}

	public String getSex() {
		return sex;
	}
	//����Ա���Ա�
	public void setSex(String sex) throws SexException {
		if((sex.equals("��")||sex.equals("Ů")) == false){
			throw new SexException("�޷�ʶ���� �� ���� Ů��");
		}
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}
	//����Ա������
	public void setAge(int age) throws AgeException {
		if(age < 18 || age > 60){
			throw new AgeException("ӦƸ��Ա������δ����������ˣ�");
		}
		this.age = age;
	}

	public double getMoney() {
		return money;
	}
	//����Ա������
	public void setMoney(double money) throws MoneyException {
		if(money < 4000){
			throw new MoneyException("���ʵ�������Ҫ�����ͱ�׼��");
		}
		this.money = money;
	}
	
	
}
