package com.bit.testdemo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee person = new Employee();
		try {
			person.setName("�ź���");
			person.setSex("��");
			person.setAge(23);
			person.setMoney(100000);
		} catch (NameNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} catch (SexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} catch (MoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("ӦƸ�ɹ���");
	}

}
