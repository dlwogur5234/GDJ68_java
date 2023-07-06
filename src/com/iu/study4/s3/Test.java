package com.iu.study4.s3;

public class Test {
//	int num1;
//	double num2;
//	
//	public void hap(int num1) {
//		System.out.println(this.num1+num1); // 지역변수와 같기때문에 이떄는 this 를 사용해야함
//	}
//	
//	public boolean same(Test t) {
//		//num1 과 다른객체의 num1이 같고
//		//num2 와  다른객체의 num2가 같으면 true를 리턴하고
//		//아니면 false를 리턴
//		boolean result = false;
//		if(this.num1==t.num1 && this.num2 == t.num2) {
//			result = true;
//		}
//		return result;
//		
//	}
//	public void method1() {
//		//참조변수명(주소).멤버변수명
//		System.out.println(this.num1 + num2); //this = 참조변수 this  객체 생성시 만들어지는 변수
										  // 객체 생성시 만들어지는 변수
//												- 만들어진 객체의 주소를 담고 있는 참조변수
//												- class 내부의 메서드 내에서만 사용 가능
//												- 개발자가 선언하는 변수가 아니라 자동으로 만들어지는 변수
//												- Object 마다 하나씩 만들어짐
//												- 생략 가능
//												- this.멤버변수명
//												- this.멤버메서드명()
//		System.out.println(this);
//		this.method2(); // this 생략 가능
//	}	
//	
//	public void method2() {
//		
//	}
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1 ,float n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, int n2,int n3) {
		
	}
}
