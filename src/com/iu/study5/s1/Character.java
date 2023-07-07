package com.iu.study5.s1;

public  class Character {
	private int hp;
	private int dmg;
	private int level;
	
	
	
	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getDmg() {
		return dmg;
	}



	public void setDmg(int dmg) {
		this.dmg = dmg;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public final void getItem() {
		System.out.println("아이템 줍기");
	}
	
//	public abstract void attack();
	public void attack() {}
	
}
