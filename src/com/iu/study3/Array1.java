package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		//�迭(array)
		int num=0;
		int num2=2;
		double d =3.12;
		
		//������Ÿ�� ������
		//�������� �ϴ� ������Ÿ�� []
		int [] nums = new int[2]; //������Ÿ�� == int[]  ������ == new ���������ϴ� ������Ÿ��[����];
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);
		System.out.println(nums);
		//�迭 ��� : �迭�Ǻ�����[�ε�����ȣ], index��ȣ�� ����Ÿ��(int)
		System.out.println(nums[0]); //�ʱ�ȭ�� = 0
		System.out.println(avgs[0]); //�ʱ�ȭ�� = 0.0
		System.out.println(chs[0]); //�ʱ�ȭ�� = ""
		System.out.println(checks[0]); //�ʱ�ȭ�� = false
		//���ڿ� 3���� ���� �迭 ����
		String a = "1";
		String b = "2";		
		String c = "3";
		
		String [] s = new String[3];
		System.out.println(s);
		System.out.println(s[0]); //�⺻�� = null ���Ѵ��� �� �˼����� ��
		
		int [] nums2 = {1,2,3}; 
		
		int nums3 [] = new int[3]; // �� ��������� ������ ��밡�� �տ��� �������� int Ÿ���̶�� ���� �� �� �ֱ⶧��
		//nums = nums2;
		//System.out.println(nums[1]); //nums2�� �ּҸ� �޾ұ� ������ 2�ǰ��� ����Ѵ�.
	
	
	}

}
