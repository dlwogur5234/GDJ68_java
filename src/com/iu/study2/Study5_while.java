package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {

	public static void main(String[] args) {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int result = random.nextInt(10); //0~10���� ���� ����
		
		while(check) {
			System.out.println("0~10�̸� ���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
			
			if(result==num) {
				System.out.println("�����Դϴ�");
				//break;
				check = false;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
		}//while ��
	}

}
