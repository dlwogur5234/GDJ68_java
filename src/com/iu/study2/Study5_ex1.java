package com.iu.study2;

import java.util.Scanner;

public class Study5_ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int level = 1;
		int gold = 0;
		
		
		for (level=1;level<15;level++) {
			if(level%5==0) {
				gold=gold+level/5*1000;
			}
//			if(level==10) {
//				gold=gold+2000;
//			}
			//������ ������ �Լ����� ������ �� ����
			System.out.println("1. ��ɽ��� 2.��������");
			int select = sc.nextInt();
			if(select !=1) {
				break;
			}
			for(int monster=0;monster<level*3;monster++) {
				System.out.println(monster+1+" ���� ��� ����");
			}
			System.out.println(level+1+"�� ���� �߽��ϴ�.");
		}
		if(level==15) {
			gold=gold+3000;
		}
		System.out.println("������: "+gold);
		System.out.println("���緹��: "+level);
	}
}
