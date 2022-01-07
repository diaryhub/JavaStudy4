package com.study.s7.zoo;

public abstract class Animal {

	int age;
	String name;
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public abstract void sleep();
	
}
