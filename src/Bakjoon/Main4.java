package Bakjoon;

import java.util.Scanner;

public class Main4 {
//백준 알고리즘25304번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		for(int i=0; i<y; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = sum+(a*b);
		}
		if(x==sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
