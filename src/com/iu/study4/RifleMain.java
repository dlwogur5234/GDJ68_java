package com.iu.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		// Ŭ������ ������ = new class�� ()
		
		Rifle rifle = new Rifle();
		
		//����� ����
		//1. ������� ������, ���������
		//2. ����޼��� ������.�ɺ��޼����()
		
		//rifle.shoot1(); //�޼��� ȣ��
		
		//rifle.shoot2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �ܹ� ,2. ����");
		int select = sc.nextInt();
		System.out.println("�Ѿ� �� �Է�");
		int b = sc.nextInt();
		if(select==1) {
			
			rifle.shoot1(b);
			
		}
		else {
			rifle.shoot2(1, "a", null);;
		}
		
	}

}
