package com.iu.study2;

import java.util.Scanner;

public class Study5_ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int level = 1;
		int gold = 0;
		int mon = 0;
		
		for (level=1;level<15;level++) {
			//������ ������ �Լ����� ������ �� ����
			System.out.println("1. ��ɽ��� 2.��������");
			int select = sc.nextInt();
			if(select !=1) {
				break;
			}
			if((level+1)%5==0) {
				gold=gold+1000;
			}
			System.out.println("������ : "+gold);
			System.out.println(level+1+"�� ���� �߽��ϴ�");
		}
	}
}
