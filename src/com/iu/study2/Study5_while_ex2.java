package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//TRPG
		int hp = 40; // user HP
		int monhp = 60; //monster HP
		int monpw = 40; //monster ���ݷ�
		boolean system = true;
		//1. ��Ÿ 2. ��ų 3.hpȸ�� 4.����
		//��Ÿ : 0~10 �̸��� ������ monster���� ����
		//��ų : 0~30 �̸��� ������ monster���� ����(�ִ� 3������ ����)
		//ȸ�� : ȸ������ 0~40 ���� 40�̻��� �Ѿ �� ����
		//���� : 50%Ȯ���� ����,����
		
		//monster
		//1 : user�� ���� 0~40�� ������ ����
		while(system) {
			if(hp>0 && monhp>0){
				int hit = random.nextInt(10);
				int skill = random.nextInt(30);
				int hill = random.nextInt(41);
				int escape = random.nextInt(2);
				//int escape = random.nextInt(50%);
				System.out.println("�����ϼ��� 1. ��Ÿ 2. ��ų 3.hpȸ�� 4.���� ");
				int select = sc.nextInt();
				
					if(select==1) {
						monhp = monhp-hit;
						System.out.println(hit+"�� ������ ���߽��ϴ�");
						System.out.println("monster ���� ü�� :" +monhp);
					}
					else if(select==2) {
						monhp = monhp-skill;
						System.out.println(skill+"�� ������ ���߽��ϴ�");
						System.out.println("monster ���� ü�� :" +monhp);
					}
					else if(select==3) {
						hp=hp+hill;
						if(hp+hill>=40) {
							hp=hp-(hp+hill%40);
						}
						else {
							hp=hp+hill;
						}
						System.out.println(hill+"��ŭ ȸ��");
						System.out.println("���� hp :"+hp);
					}
					else if(select==4) {
						if(escape==0) {
							System.out.println("Ż�� ����");
						}
						else if(escape==1){
							System.out.println("Ż�� ����");
						}
					}
			} //if(hp>0 && monhp>0)
			else{
				if(hp==0) {
					System.out.println("user���");
					break;
				}
				else if(monhp==0) {
					System.out.println("monster óġ");
					break;
				}
					
			}
		}

	}
}
