package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		//배열(array)
		int num=0;
		int num2=2;
		double d =3.12;
		
		//데이터타입 변수명
		//모을려고 하는 데이터타입 []
		int [] nums = new int[2]; //데이터타입 == int[]  변수명 == new 모을려고하는 데이터타입[갯수];
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);
		System.out.println(nums);
		//배열 사용 : 배열의변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]); //초기화값 = 0
		System.out.println(avgs[0]); //초기화값 = 0.0
		System.out.println(chs[0]); //초기화값 = ""
		System.out.println(checks[0]); //초기화값 = false
		//문자열 3개를 모을 배열 선언
		String a = "1";
		String b = "2";		
		String c = "3";
		
		String [] s = new String[3];
		System.out.println(s);
		System.out.println(s[0]); //기본값 = null 무한대의 값 알수없는 값
		
		int [] nums2 = {1,2,3}; 
		
		int nums3 [] = new int[3]; // 잘 사용하지는 않으나 사용가능 앞에만 봤을때는 int 타입이라고 착각 할 수 있기때문
		//nums = nums2;
		//System.out.println(nums[1]); //nums2의 주소를 받았기 때문에 2의값을 출력한다.
	
	
	}

}
