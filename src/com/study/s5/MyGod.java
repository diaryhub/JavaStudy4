package com.study.s5;

public class MyGod {
	
	private static MyGod mygod = new MyGod();
	
	private MyGod() {};
	
	public static MyGod makeGod() {
		
		return mygod;
	}
	
}
