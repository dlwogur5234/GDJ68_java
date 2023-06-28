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
		int monpw = 40; //monster 공격력
		boolean system = true;
		//1. 평타 2. 스킬 3.hp회복 4.도망
		//평타 : 0~10 미만의 공격이 monster에게 적용
		//스킬 : 0~30 미만의 공격이 monster에게 적용(최대 3번까지 가능)
		//회복 : 회복량이 0~40 까지 40이상은 넘어갈 수 없음
		//도망 : 50%확률로 성공,실패
		
		//monster
		//1 : user를 공격 0~40의 공격을 가함
		while(system) {
			if(hp>0 && monhp>0){
				int hit = random.nextInt(10);
				int skill = random.nextInt(30);
				int hill = random.nextInt(41);
				int escape = random.nextInt(2);
				//int escape = random.nextInt(50%);
				System.out.println("선택하세요 1. 평타 2. 스킬 3.hp회복 4.도망 ");
				int select = sc.nextInt();
				
					if(select==1) {
						monhp = monhp-hit;
						System.out.println(hit+"의 공격을 가했습니다");
						System.out.println("monster 남은 체력 :" +monhp);
					}
					else if(select==2) {
						monhp = monhp-skill;
						System.out.println(skill+"의 공격을 가했습니다");
						System.out.println("monster 남은 체력 :" +monhp);
					}
					else if(select==3) {
						hp=hp+hill;
						if(hp+hill>=40) {
							hp=hp-(hp+hill%40);
						}
						else {
							hp=hp+hill;
						}
						System.out.println(hill+"만큼 회복");
						System.out.println("남은 hp :"+hp);
					}
					else if(select==4) {
						if(escape==0) {
							System.out.println("탈출 성공");
						}
						else if(escape==1){
							System.out.println("탈출 실패");
						}
					}
			} //if(hp>0 && monhp>0)
			else{
				if(hp==0) {
					System.out.println("user사망");
					break;
				}
				else if(monhp==0) {
					System.out.println("monster 처치");
					break;
				}
					
			}
		}

	}
}
