package com.iu.study2;

import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		//FPS
		//30�� , 3źâ
		//M16, 2����: �ܹ�, 3����
		
		//1. �ܹ� 2.����
		//��, ŸŸ��
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.�ܹ� 2.����");
			int select=sc.nextInt();
			int count = 10;
			String sound = "ŸŸ��"; 
			if(select==1) {	
				count=30;
				sound="��";
			}				
//			else {
//				count=10;
//				sound="ŸŸ��";
//			}
				for(int b=0;b<count;b++) {
					System.out.println(sound);
			}
		}
	}

}
