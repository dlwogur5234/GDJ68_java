package com.iu.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ������ �Է��ϼ���");
		int j = sc.nextInt();
		
		int [] nums = new int[j];
		
		for(int i=0; i<j; i++) {
			System.out.println(i+1+" ��° ���� �Է�");
			nums[i]=sc.nextInt();
		}
		for(int i=0; i<j; i++) {
			System.out.println(nums[i]);
		}
		
		
		
	}

}
