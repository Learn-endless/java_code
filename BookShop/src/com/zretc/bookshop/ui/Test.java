package com.zretc.bookshop.ui;

import java.util.Scanner;

import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;
import com.zretc.bookshop.service.impl.UserServiceImpl;

//ui��ͼ��
//���̿���+����ҵ�񷽷�(����ҵ���߼���ʵ����ķ���)
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ҵ���߼���ʵ�ֵĶ���
		UserService user = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		//ϵͳִ������
		loop1:while(true) {
			System.out.println("************************");
			System.out.println("****  ��ӭ����ͼ��ϵͳ  *****");
			System.out.println("**** 1.��¼ 2.�˳�ϵͳ  *****");
			System.out.println("************************");
			System.out.print("��ѡ�񡷡���");
			int num = sc.nextInt();
			if(num == 1) {
				//��¼����
				loop2:while(true) {
					System.out.print("�������û�����");
					String userName = sc.next();
					System.out.print("���������룺");
					String userPwd = sc.next();
					
					//���÷���
					UserEntity user1 = user.login(userName, userPwd);
					
						if(user1 != null) {
							System.out.println("��ӭ��½��");
							System.out.println("�û���ţ�"+user1.getUserId()+"�û�����"+user1.getUserName());
						while(true) {
							System.out.println("1.�޸�����\t2.ע��\t\t3.�˳���½\t4.�˳�ϵͳ");
							System.out.print("������ѡ��");
							int ret = sc.nextInt();
							if(ret == 1) {
								//�޸�����
								System.out.print("������ԭ���룺");
								String newP1 = sc.next();
								System.out.print("�����������룺");
								String newP2 = sc.next();
								
								boolean flag = user.updatePwd(user1,newP1,newP2);
								System.out.println(flag?"�޸ĳɹ�":"�޸�ʧ��");
								if(flag) {
									break;
								}
							}else if(ret == 2) {
								//ע��
								System.out.print("��������Ҫע����û�����");
								String name = sc.next();
								System.out.print("��������Ҫע������룺");
								String pwd = sc.next();
								boolean flag = user.userRegister(name, pwd);
								System.out.println(flag?"ע��ɹ�":"ע��ʧ��");
								if(flag) {
									break;
								}
							}else if(ret == 3) {
								//�˳���½
								break loop2;
							}else if(ret == 4) {
								//�˳�ϵͳ
								System.out.println("��ӭ�´ι���");
								break loop1;
							}else {
								System.out.println("��������������룡");
								continue;
							}
						}
							
						}else {
							System.out.println("�����������û��������룡");
							break loop2;
						}
				
				}
			}else if(num == 2) {
				System.out.println("�˳�ϵͳ������");
				break;
			}else {
				System.out.println("ѡ���������������룡����");
				continue;
			}
		}
	}

}
