package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int id=1234;
		//int pw=5678;
		//ȸ�����Խ� �Է��� ������
		//�α��� ����
		// ID�� PW�� �Է¹޾Ƽ� �α��� ó��
		//�α��μ��� , �α��� ����
		System.out.println("ID: ");
		int id = sc.nextInt();
		System.out.println("pw: ");
		int pw = sc.nextInt();
		boolean login;
		
		if (id==1234 && pw==1234) {
			login = true;
			System.out.println("�α��� ����");
		}
		else {
			login = false;
			System.out.println("�α��� ����");
		}
		
		//----- �α��� ó�� �� �ۼ�
		//�α����� ������ ����� ���� ����
		//1. ������ , 2.�����
		//�޿� �Է�
		//�������̸� : �ǰ����� 3%, ���ο��� 2% ��뺸�� 1% , ���纸�� 1%
		//����� :3.3%
		//�Ǳ޿� ���
		if(login == true) {
		System.out.println("1. ������ 2. ����� �����ϼ��� :");
		int emp = sc.nextInt();
		System.out.println("�޿��� �Է��ϼ���: ");
		int sal = sc.nextInt();
	
		
		if(login == true && emp == 1) {
			System.out.println((int)(sal-sal*0.07));
		}
		else if(login == true && emp == 2) {
			System.out.println((int)(sal-sal*0.033));
		}
		else if (login == true && emp > 2) {
			System.out.println("ERROR");
		}
		
		}
	System.out.println("���α׷� ����");
	}

}
