package com.iu.study4.s2;

public class Chef {
	
	String name;
	public void makeRamyun2(Ramyun [] ramyuns) {
		for(int i=0; i<ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "신라면";
			ramyun.price = 2500;
			ramyuns[i] = ramyun;
		}
	}
	
	public Ramyun [] makeRamyun(int count) {
		//Ramyun ramyun = new Ramyun();
		//Ramyun ramyun2 = new Ramyun(); //쓸 수 없음
		//ramyun2 = ramyun;
		//ramyun2 = new Ramyun(); // int num =2; num = 3; 이랑 같은 형태
		Ramyun [] ramyuns = new Ramyun[count];
		for(int i=0; i<count; i++) {
			Ramyun ramyun = new Ramyun();
			ramyuns[i]=ramyun;
			
			ramyun.title = "신라면";
			ramyun.price = 2500;
			//System.out.println(ramyuns[i]); ramyun 출력값과 같음
			System.out.println(ramyun);
		}
		
		return ramyuns;
		
	}
	
	public void makeKimbab() {
		
	}
	
}
