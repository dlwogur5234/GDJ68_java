package com.iu.study4.s5;

public class StaticTest {

	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum=50;
		instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	public static void staticMethod() {
		StaticTest.staticNum=20;
		//instanceMethod(); 객체가 만들어질수도 아닐수도 있어서 에러가 남
		//instaceNum=50; 객체가 만들어질수도 아닐수도 있어서 에러가 남
		System.out.println("클래스메서드");
	}
	
}
