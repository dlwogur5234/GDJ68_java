package com.iu.study2;

import java.util.Scanner;

public class Study5_ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int level = 1;
		int gold = 0;
		int mon = 0;
		
		for (level=1;level<15;level++) {
			//렙업시 게임을 게속할지 종료할 지 선택
			System.out.println("1. 사냥시작 2.게임종료");
			int select = sc.nextInt();
			if(select !=1) {
				break;
			}
			if((level+1)%5==0) {
				gold=gold+1000;
			}
			System.out.println("현재골드 : "+gold);
			System.out.println(level+1+"로 렙업 했습니다");
		}
	}
}
