package com.study.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer cpt = new Computer();
		Phone phone = new Phone();
		TV tv = new TV();
		
		cpt.brand= "Intel Core";
		phone.brand= "galuxy";
		tv.brand= "오브제";
		
		cpt.company ="Intel";
		phone.company="samsung";
		tv.company="LG";
		
		cpt.price =150;
		phone.price=100;
		tv.price=200;
		
		cpt.point=3;
		phone.point=1;
		tv.point=5;
		
		cpt.CPU = "i7-6700k";
		phone.pixel = 800;
		tv.size = 30;
		
		Client diary = new Client();
		diary.money = 1000;
		diary.point = 0;
		diary.buy(cpt);
		
		
	}

}
