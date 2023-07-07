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
		
		worrier = (Worrier)w[0]; // Character 타입이기 때문이 형변환을 사용한다.
		magician = (Magician)w[1];
		
		magician.setMp(20);
		
		//---------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
	}

}
