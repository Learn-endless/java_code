package com.oracle.main;

public class Task {
	// 1.�ж�������
	public int isTriangle(int a,int b,int c,String str) {
		if(a + b > c && a + c > b && b + c > a) {
			if(a == b && b == c && str == "�ȱ�������") {
				return 1;
			}else if(a == b || b == c || a == c && str == "����������") {
				return 1;
			}else {
				if(str == "��ͨ������") {
					return 1;
				}else {
					return 0;
				}
			}
		}else {
			if(str == "���ܹ���������") {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	//2.�жϳɼ��ȼ�
	public int testGrade(int grade,String ch) {
		if(grade >= 0 && grade < 60 && ch == "��") {
			return 1;
		}else if(grade >= 60 && grade < 80 && ch == "��") {
			return 1;
		}else if(grade >= 80 && grade < 90 && ch == "��") {
			return 1;
		}else if(grade >= 90 && grade <= 100 && ch == "��") {
			return 1;
		}else {
			if(ch == "����") {
				return 1;
			}else {
				return 0;
			}
		}
	}

}
