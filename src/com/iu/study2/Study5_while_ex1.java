package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int fail = 0;
		//while
		//1. �α��νõ� 2. ���α׷� ����
		//
		
		System.out.println("1.�α��� 2. ���α׷����� �����ϼ��� : ");
		int sel = sc.nextInt();
		boolean login = true;
		
		if(sel==1) {
			while(login) {
				System.out.println("ID�� �Է��ϼ���");
				int userid = sc.nextInt();
				System.out.println("PW�� �Է��ϼ���");
				int userpw = sc.nextInt();
				if(id==userid && pw==userpw) {
					System.out.println("�α��� ����");
					login = false;
					int lev = 0;
					int gold = 0;
					int mon = 0;
					for(lev=0; lev<16; lev++) {
						for(mon=0;mon<43;mon++) {
							if(mon%3==0) {
								lev=lev+1;
								System.out.println("������!!");
								if(lev==5) {
									gold=gold+1000;
								}	
								if(lev==10) {
									gold=gold+2000;
								}
								if(lev==15) {
									gold=gold+3000;
								}
							System.out.println("���緹�� : " +lev);
							System.out.println("������ : " +gold);
							if(lev==15) {
								System.out.println("�����޼�! ����� �����մϴ�");
								break;
							}
							System.out.println("����� ����Ͻðڽ��ϱ�? 1.�� 2.�ƴϿ�");
						
							int choose = sc.nextInt();
							
							}	
						}
					}
				}
				else {
					System.out.println("Ʋ�Ƚ��ϴ�");
					fail=fail+1;
					System.out.println("Ʋ��Ƚ�� :"+fail);
					if(fail==5) {
						System.out.println("�α��� 5ȸ ���� !!");
						break;
					}
					
				}
			}
		}
		
		
		//�α��� ������������ ����
		//MMORPG 
		//���۷��� : 1
		//��� ������ ����ġ�� ����
		//�ִ뷹��:15
		//ó������ 0
		//5���� �޼��� 1000 GOLD ����
		//10���� �޼��� 2000 GOLD ����
		//15���� �޼��� 3000 GOLD ����
		//1>2 : 3����
		//2>3 : 6����
		//3>4 : 9����
		//4>5 : 12����
		//...
		//14>15 : 42����
		
		//���緹�� > 15:42
		//������ ������ ������� ������ �� ����
		else if(sel==2) {
			System.out.println("���α׷� ����");
		}
		else {
			System.out.println("ERROR");
		}
	
		}
	}



