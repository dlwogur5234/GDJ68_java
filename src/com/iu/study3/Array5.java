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
				int ch = 0; // 자리바꿀 값을 담을 변수
				if(nums[i]>nums[j]) {
					ch = nums[i]; //비교하였을때 큰값을 넣는다
					nums[i] = nums[j]; // 작은값을 i에 복사
					nums[j] = ch; // 큰값을 다시j에 선언
				}
			}
		}
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

}

