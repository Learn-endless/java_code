package com.j2se.work;

public class Master {
	public void play(MyShape m){
		if(m instanceof Rect){
			Rect a = (Rect)m;
			a.play();
		}
		if(m instanceof Cricle){
			Cricle b = (Cricle)m;
			b.play();
		}
	}
}
