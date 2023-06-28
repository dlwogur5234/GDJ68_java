package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int id=1234;
		//int pw=5678;
		//회원가입시 입력한 데이터
		//로그인 과정
		// ID와 PW를 입력받아서 로그인 처리
		//로그인성공 , 로그인 실패
		System.out.println("ID: ");
		int id = sc.nextInt();
		System.out.println("pw: ");
		int pw = sc.nextInt();
		boolean login;
		
		if (id==1234 && pw==1234) {
			login = true;
			System.out.println("로그인 성공");
		}
		else {
			login = false;
			System.out.println("로그인 실패");
		}
		
		//----- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직 , 2.계약직
		//급여 입력
		//정규직이면 : 건강보험 3%, 국민연금 2% 고용보험 1% , 산재보험 1%
		//계약직 :3.3%
		//실급여 출력
		if(login == true) {
		System.out.println("1. 정규직 2. 계약직 선택하세요 :");
		int emp = sc.nextInt();
		System.out.println("급여를 입력하세요: ");
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
	System.out.println("프로그램 종료");
	}

}
