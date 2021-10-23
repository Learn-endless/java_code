package com.oracle.main;

public class Task {
	// 1.判断三角形
	// 1:是三角形		0：不是三角形
	public int isTriangle(int a,int b,int c) {
		if(a + b > c && a + c > b && b + c > a) {
			     return 1;
		}else {
			return 0;
		}
	}
	
	//2.判断成绩等级
	//1:优		2：良		3：中		4：差		5：出错
	public int testGrade(int grade) {
		if(grade >= 0 && grade < 60) {
			return 4;
		}else if(grade >= 60 && grade < 80) {
			return 3;
		}else if(grade >= 80 && grade < 90) {
			return 2;
		}else if(grade >= 90 && grade <= 100) {
			return 1;
		}else {
			return 5;
			}
		}
}

