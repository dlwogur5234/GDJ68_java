package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int [] nums = new int[6];
		Random random = new Random();
	
		for(int i=0; i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1; j<nums.length;j++) {
				int ch = 0; // �ڸ��ٲ� ���� ���� ����
				if(nums[i]>nums[j]) {
					ch = nums[i]; //���Ͽ����� ū���� �ִ´�
					nums[i] = nums[j]; // �������� i�� ����
					nums[j] = ch; // ū���� �ٽ�j�� ����
				}
			}
		}
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

}

