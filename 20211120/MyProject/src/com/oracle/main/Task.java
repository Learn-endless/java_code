package com.oracle.main;

public class Task {
	// 1.判断三角形
	public int isTriangle(int a,int b,int c,String str) {
		if(a + b > c && a + c > b && b + c > a) {
			if(a == b && b == c && str == "等边三角形") {
				return 1;
			}else if(a == b || b == c || a == c && str == "等腰三角形") {
				return 1;
			}else {
				if(str == "普通三角形") {
					return 1;
				}else {
					return 0;
				}
			}
		}else {
			if(str == "不能构成三角形") {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	//2.判断成绩等级
	public int testGrade(int grade,String ch) {
		if(grade >= 0 && grade < 60 && ch == "差") {
			return 1;
		}else if(grade >= 60 && grade < 80 && ch == "中") {
			return 1;
		}else if(grade >= 80 && grade < 90 && ch == "良") {
			return 1;
		}else if(grade >= 90 && grade <= 100 && ch == "优") {
			return 1;
		}else {
			if(ch == "出错") {
				return 1;
			}else {
				return 0;
			}
		}
	}

}
