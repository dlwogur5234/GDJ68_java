package com.iu.study2;

import java.util.Scanner;

public class Study5_ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int level = 1;
		int gold = 0;
		
		
		for (level=1;level<15;level++) {
			if(level%5==0) {
				gold=gold+level/5*1000;
			}
//			if(level==10) {
//				gold=gold+2000;
//			}
			//렙업시 게임을 게속할지 종료할 지 선택
			System.out.println("1. 사냥시작 2.게임종료");
			int select = sc.nextInt();
			if(select !=1) {
				break;
			}
			for(int monster=0;monster<level*3;monster++) {
				System.out.println(monster+1+" 마리 사냥 성공");
			}
			System.out.println(level+1+"로 렙업 했습니다.");
		}
		if(level==15) {
			gold=gold+3000;
		}
		System.out.println("현재골드: "+gold);
		System.out.println("현재레벨: "+level);
	}
}
