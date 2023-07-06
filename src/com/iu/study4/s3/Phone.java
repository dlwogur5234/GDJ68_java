package com.iu.study4.s3;

public class Phone {

	String company = "APPLE";
	String brand= "IPHONE15";
	
	{
		//인스턴스 초기화 블럭
		this.company="LG";
		this.brand="가로본능";
	}
	
	public Phone() {
		this.company = "SAMSUNG";
		this.brand="S20";
	}

	public void info() {
		System.out.println("company : "+this.company);
		System.out.println("brand : "+this.brand);

	}
}
