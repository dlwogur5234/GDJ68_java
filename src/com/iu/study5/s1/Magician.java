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
		super(); // �θ��� ������ ȣ��
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
//		System.out.println("������ �ݱ�");
//	}

//	public void attack() {
//		System.out.println("���̾� ��");
//	}
	
	//overriding : ����
	//��ӹ��� �޼����� ������ �ڱ⿡ �°� ������
	//��ӹ��� �޼����� ����δ� �����ϰ� �ۼ�
	public void attack() {
		System.out.println("���̾� ��");
	}
	
}
