package com.iu.study2;

import java.util.Scanner;

public class Study3_ex1 {
	public static void main(String[] args) {
		// ������ �Է�
		//���� ��� ��� (����� int)
		//90:A 80:B 70:C 60:D �� �� :F
		//Switch ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����: ");
		int ko = sc.nextInt();
		System.out.println("���� : ");
		int eng = sc.nextInt();
		System.out.println("���� : ");
		int math = sc.nextInt();
		
		int total = ko+eng+math;
		System.out.println("���� :"+total);
		int avg = total/3;
		System.out.println("��� :"+avg);
		switch(avg/10) {
		case 10:
		case 9:
		{
			System.out.println("A");
			break;
		}
		case 8:{
			System.out.println("B");
			break;
		}
		case 7:{
			System.out.println("C");
			break;
		}
		case 6:{
			System.out.println("D");
			break;
		}
		default:{
			System.out.println("F");
		}
	}
}
}
