package com.iu.study4;

public class Rifle {
	
	boolean mode; //true : �ܹ� , false : ����
	
	//�޼��� ���� ����
	// ���������� [�׿�������] ����Ÿ�� �޼����([�Ű��������� ����]) {�����ڵ�}   *[]:�ɼ�\
	// public static void main(String [] args){}
	
	//shoot1
	
	public void shoot1(int count) {
		int damage = 20;
		for(int i=0; i<count; i++) {
		System.out.println("��");
		}
	}
	
	//shoot2
	public void shoot2(int c,String n,int [] ar) {
		System.out.println("ŸŸ��");
	}
}
