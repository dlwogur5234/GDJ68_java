package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int fail = 0;
		//while
		//1. 로그인시도 2. 프로그램 종료
		//
		
		System.out.println("1.로그인 2. 프로그램종료 선택하세요 : ");
		int sel = sc.nextInt();
		boolean login = true;
		
		if(sel==1) {
			while(login) {
				System.out.println("ID를 입력하세요");
				int userid = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int userpw = sc.nextInt();
				if(id==userid && pw==userpw) {
					System.out.println("로그인 성공");
					login = false;
					int lev = 0;
					int gold = 0;
					int mon = 0;
					for(lev=0; lev<16; lev++) {
						for(mon=0;mon<43;mon++) {
							if(mon%3==0) {
								lev=lev+1;
								System.out.println("레벨업!!");
								if(lev==5) {
									gold=gold+1000;
								}	
								if(lev==10) {
									gold=gold+2000;
								}
								if(lev==15) {
									gold=gold+3000;
								}
							System.out.println("현재레벨 : " +lev);
							System.out.println("현재골드 : " +gold);
							if(lev==15) {
								System.out.println("만렙달성! 사냥을 종료합니다");
								break;
							}
							System.out.println("사냥을 계속하시겠습니까? 1.예 2.아니오");
						
							int choose = sc.nextInt();
							
							}	
						}
					}
				}
				else {
					System.out.println("틀렸습니다");
					fail=fail+1;
					System.out.println("틀린횟수 :"+fail);
					if(fail==5) {
						System.out.println("로그인 5회 실패 !!");
						break;
					}
					
				}
			}
		}
		
		
		//로그인 성공했을때만 진행
		//MMORPG 
		//시작레벨 : 1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//처음골드는 0
		//5레벨 달성시 1000 GOLD 지급
		//10레벨 달성시 2000 GOLD 지급
		//15레벨 달성시 3000 GOLD 지급
		//1>2 : 3마리
		//2>3 : 6마리
		//3>4 : 9마리
		//4>5 : 12마리
		//...
		//14>15 : 42마리
		
		//현재레벨 > 15:42
		//렙업시 게입을 계속할지 종료할 지 선택
		else if(sel==2) {
			System.out.println("프로그램 종료");
		}
		else {
			System.out.println("ERROR");
		}
	
		}
	}



