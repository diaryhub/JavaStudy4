package com.study.s9.himart;

public class Client {
	int money;
	int point;
	
	public void buy(Product pd) {
		money=money-pd.price;
		this.point = this.point + pd.point;
		System.out.println("최종 금액:"+money);
		System.out.println("최종 포인트:"+this.point);
	}
}
