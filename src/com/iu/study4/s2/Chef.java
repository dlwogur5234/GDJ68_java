package com.iu.study4.s2;

public class Chef {
	
	String name;
	public void makeRamyun2(Ramyun [] ramyuns) {
		for(int i=0; i<ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "�Ŷ��";
			ramyun.price = 2500;
			ramyuns[i] = ramyun;
		}
	}
	
	public Ramyun [] makeRamyun(int count) {
		//Ramyun ramyun = new Ramyun();
		//Ramyun ramyun2 = new Ramyun(); //�� �� ����
		//ramyun2 = ramyun;
		//ramyun2 = new Ramyun(); // int num =2; num = 3; �̶� ���� ����
		Ramyun [] ramyuns = new Ramyun[count];
		for(int i=0; i<count; i++) {
			Ramyun ramyun = new Ramyun();
			ramyuns[i]=ramyun;
			
			ramyun.title = "�Ŷ��";
			ramyun.price = 2500;
			//System.out.println(ramyuns[i]); ramyun ��°��� ����
			System.out.println(ramyun);
		}
		
		return ramyuns;
		
	}
	
	public void makeKimbab() {
		
	}
	
}