package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {

		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem();
	
//		worrier.axe.name
		Character character = magician;
		character = worrier;
		
		
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
		worrier = (Worrier)w[0]; // Character Ÿ���̱� ������ ����ȯ�� ����Ѵ�.
		magician = (Magician)w[1];
		
		magician.setMp(20);
		
		//---------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
	}

}
