package com.iu.study4.s3;

public class Car {
	//���������� ���� = deflult
	String brand; 
	String color;
	String company;
	int price;
	
	//������(Constructor)
	//���������� Ŭ������� ������ �̸�([�Ű������� ����]) {}
	public Car() {
		//�⺻������
		this("A7"); //  ������ ������ �ٸ� �����ڸ� ȣ�� �� �� ���
		System.out.println("�ڵ����� ����ϴ�");
		//this.company="Audi";
		//this.brand = "A7";
		//this.color = "Black";
		//this.price = 9985;
	}
	public Car(String brand) {
		this(brand,"Pink");
//		this.company="Audi";
//		this.brand = brand;
//		this.color = "Black";
//		this.price = 9985;
	}
	
	public Car(String brand,String color) {
		this(brand,color,9985);
//		this.company="Audi";
//		this.brand = brand;
//		this.color = color;
//		this.price = 9985;
	}
	
	public Car(String company,String brand, int price) {
		this.company=company;
		this.brand = brand;
		this.color = "Black";
		this.price = price;
	}
	
	public void info() {
		
		System.out.println("Company : "+company);
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Wheel : "+price+"����");
	}
	
}
