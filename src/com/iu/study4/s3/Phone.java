package com.iu.study4.s3;

public class Phone {

	String company = "APPLE";
	String brand= "IPHONE15";
	
	{
		//�ν��Ͻ� �ʱ�ȭ ��
		this.company="LG";
		this.brand="���κ���";
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
