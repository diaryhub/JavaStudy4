package com.study.s8.RPG;

public class Magician extends Character implements Act {
	
	int mp;
	
	public void attack() {
		System.out.println("마법");
	}
	@Override
	public void move() {
		System.out.println("순간이동");
	}
}
