package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		int [] nums =  {1,2,3,4};
		//System.out.println(nums.length);
		
		int [] copyNums = new int[nums.length+1]; 
		
		for(int i=0; i<nums.length;i++) {
		copyNums[i] = nums[i]; //°ª º¹»ç
		}
		copyNums[nums.length] = 5;
		nums=copyNums;
		
		for(int i=0; i<nums.length;i++) {
			//System.out.println(nums[i]);
		}
		int [] copyNums2 = new int[nums.length-1];
		for(int i=0;i<copyNums.length-1;i++) {
			copyNums2[i] = nums[i];
			System.out.println(copyNums2[i]);
		}
	}

}
