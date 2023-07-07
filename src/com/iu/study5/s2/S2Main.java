package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setCompany("apple");
		phone.setModel("Iphone14Pro");
		phone.setColor("White");
		phone.setPrice(2000000);
		phone.setOs("ios");
		phone.setPoint(20);
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModel("°¶·°½ÃºÏ");
		computer.setCpu("i9");
		computer.setColor("white");
		computer.setPrice(2100000);
		computer.setPoint(21);
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModel("LgTV");
		tv.setInch(100);
		tv.setPrice(4500000);
		tv.setPoint(45);
		tv.setColor("black");
		Customer karina = new Customer();
		
		Himart [] h = new Himart[3];
		
		h[0] = tv;
		h[1] = phone;
		h[2] = computer;
		
		karina.buy(h);
		
		//2°³
	}

}
