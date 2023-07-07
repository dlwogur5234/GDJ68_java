package com.iu.study5.s1;

public class Magician extends Character{
//	private int hp;
	private int mp;
//	private int dmg;
//	private int level;
	
//	public int getHp() {
//		return hp;
//	}
//
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
	
	public Magician() {
		super(); // 부모의 생성자 호출
	}
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

//	public int getDmg() {
//		return dmg;
//	}
//
//	public void setDmg(int dmg) {
//		this.dmg = dmg;
//	}
//
//	public int getLevel() {
//		return level;
//	}
//
//	public void setLevel(int level) {
//		this.level = level;
//	}
	
//	public void getItem() {
//		System.out.println("아이템 줍기");
//	}

//	public void attack() {
//		System.out.println("파이어 볼");
//	}
	
	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의
	//상속받은 메서드의 선언부는 동일하게 작성
	public void attack() {
		System.out.println("파이어 볼");
	}
	
}
