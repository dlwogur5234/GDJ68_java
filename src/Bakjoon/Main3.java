package Bakjoon;

import java.util.Scanner;

public class Main3 {
//���� 8393��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i=1; i<n+1; i++) {
			
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
