package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Himart himart) {
		this.money = this.money-himart.getPrice();
		this.point = this.point+himart.getPoint();
		
		System.out.println(this.money);
		System.out.println(this.point);

	}
	
	public void buy(Himart [] himart) {
		for(int i=0;i<himart.length;i++) {
			this.buy(himart[i]);
		}
		
	}
}
