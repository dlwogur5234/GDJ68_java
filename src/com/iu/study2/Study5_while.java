package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {

	public static void main(String[] args) {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int result = random.nextInt(10); //0~10사이 숫자 랜덤
		
		while(check) {
			System.out.println("0~10미만 숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(result==num) {
				System.out.println("정답입니다");
				//break;
				check = false;
			}
			else {
				System.out.println("틀렸습니다");
			}
		}//while 끝
	}

}
