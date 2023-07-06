package com.iu.study4.s3;

public class Car {
	//접근지정자 생략 = deflult
	String brand; 
	String color;
	String company;
	int price;
	
	//생성자(Constructor)
	//접근지정자 클래스명과 동일한 이름([매개변수들 선언]) {}
	public Car() {
		//기본생성자
		this("A7"); //  생성자 내에서 다른 생성자를 호출 할 때 사용
		System.out.println("자동차를 만듭니다");
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
		System.out.println("Wheel : "+price+"만원");
	}
	
}
