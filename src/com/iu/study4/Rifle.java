package com.iu.study4;

public class Rifle {
	
	boolean mode; //true : 단발 , false : 연발
	
	//메서드 선언 공식
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수르르 선언]) {실행코드}   *[]:옵션\
	// public static void main(String [] args){}
	
	//shoot1
	
	public void shoot1(int count) {
		int damage = 20;
		for(int i=0; i<count; i++) {
		System.out.println("탕");
		}
	}
	
	//shoot2
	public void shoot2(int c,String n,int [] ar) {
		System.out.println("타타탕");
	}
}
