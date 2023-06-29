package Bakjoon;

import java.util.Scanner;
//น้มุ 2485น๘
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int gold = 0;
		
		if(a==b&&b==c&&a==c) {
			gold = 10000+a*1000;
		}
		else if(a==b || b==c || c==a) {
			if(a==b || c==a) {
				gold = 1000+a*100;
			}
			else {
				gold = 1000+b*100;
			}
		}
		else {
			int max = Math.max(Math.max(a,b),c);
			gold = max*100;
		}
		System.out.println(gold);
	}

}
