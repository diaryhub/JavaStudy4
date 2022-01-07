package com.study.s8.RPG;

public class Knight extends Character implements Act{
	
	@Override
	public void attack() {
		System.out.println("베기");
	}
	
	@Override
	public void move() {
		System.out.println("걷기");
	}
}
