package com.iu.study4.s5;

public class StaticTest {

	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum=50;
		instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("����޼���");
	}
	public static void staticMethod() {
		StaticTest.staticNum=20;
		//instanceMethod(); ��ü�� ����������� �ƴҼ��� �־ ������ ��
		//instaceNum=50; ��ü�� ����������� �ƴҼ��� �־ ������ ��
		System.out.println("Ŭ�����޼���");
	}
	
}
